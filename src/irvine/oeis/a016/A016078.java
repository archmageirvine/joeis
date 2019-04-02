package irvine.oeis.a016;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016078 Smallest number that is sum of 2 positive n-th powers in 2 different ways.
 * @author Sean A. Irvine
 */
public class A016078 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mSeen.clear();
    Z m = Z.ZERO;
    while (true) {
      // Increment maximum base by 1 and augment seen with all new sums
      m = m.add(1);
      final Z a = m.pow(mN);
      mSeen.add(a.multiply2()); // sentinel (ensures set always has at least 1 member in next test)
      while (mSeen.first().compareTo(a) <= 0) {
        mSeen.pollFirst(); // throw away anything that can never have more than 1 representation
      }
      for (Z t = Z.ONE; t.compareTo(m) < 0; t = t.add(1)) {
        final Z b = t.pow(mN);
        final Z s = a.add(b);
        if (!mSeen.add(s)) {
          return s;
        }
      }
      if (mVerbose && m.mod(1000) == 0) {
        System.out.println(m + " : bit length " + mSeen.first().bitLength());
      }
    }
  }
}
