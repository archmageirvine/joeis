package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A003037 Smallest number of complexity n: smallest number requiring n 1's to build using <code>+, *</code> and ^.
 * @author Sean A. Irvine
 */
public class A003037 implements Sequence {

  private long mPowBound = 10;
  private long mBound = 1L << mPowBound;
  private final List<Set<Long>> mConstructs = new ArrayList<>();
  private LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();

  private long performOneIteration() {
    if (mConstructs.isEmpty()) {
      mConstructs.add(Collections.singleton(1L));
      mSeen.set(1L);
      return 1;
    } else {
      // Construct numbers of complexity n+1
      final int n = mConstructs.size();
      long smallest = mBound;
      final Set<Long> s = new HashSet<>();
      mConstructs.add(s);
      // Do +1 as a special case first (since *1 and ^1 are pretty useless)
      for (final long v : mConstructs.get(n - 1)) {
        final long w = v + 1;
        if (!mSeen.isSet(w)) {
          s.add(w);
          mSeen.set(w);
          if (w < smallest) {
            smallest = w;
          }
        }
      }
      // Now do remaining pairings
      for (int k = 1; k < n - 1; ++k) {
        final Set<Long> a = mConstructs.get(k);
        final Set<Long> b = mConstructs.get(n - 1 - k);
        if (k <= n + 1 - k) {
          // Addition and multiplication are commutative
          for (final long u : a) {
            for (final long v : b) {
              final long wAdd = u + v;
              if (wAdd > 0 && wAdd < mBound && !mSeen.isSet(wAdd)) {
                s.add(wAdd);
                mSeen.set(wAdd);
                if (wAdd < smallest) {
                  smallest = wAdd;
                }
              }
              final Z z = Z.valueOf(u).multiply(v);
              if (z.bitLength() <= mPowBound) {
                final long wMul = z.longValue();
                if (wMul < mBound && !mSeen.isSet(wMul)) {
                  s.add(wMul);
                  mSeen.set(wMul);
                  if (wMul < smallest) {
                    smallest = wMul;
                  }
                }
              }
            }
          }
        }
        for (final long u : a) {
          for (final long v : b) {
            if (v <= mPowBound) {
              final Z z = Z.valueOf(u).pow((int) v);
              if (z.bitLength() <= mPowBound) {
                final long wExp = z.longValue();
                if (wExp < mBound && !mSeen.isSet(wExp)) {
                  s.add(wExp);
                  mSeen.set(wExp);
                  if (wExp < smallest) {
                    smallest = wExp;
                  }
                }
              }
            }
          }
        }
      }
      //System.out.println(s);
      return smallest;
    }
  }

  @Override
  public Z next() {
    while (true) {
      final long smallest = performOneIteration();
      if (smallest < mBound) {
        return Z.valueOf(smallest);
      }
      //System.out.println("Recomputing with bigger bounds");
      final int n = mConstructs.size();
      mConstructs.clear();
      mSeen = new LongDynamicBooleanArray();
      mPowBound += 3; // Avoid having to resize too often
      mBound <<= 3;
      // Recompute to where we were before
      for (int k = 1; k < n; ++k) {
        performOneIteration();
      }
    }
  }
}
