package irvine.oeis.a127;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127824 Triangle in which row n is a sorted list of all numbers having total stopping time n in the Collatz (or 3x+1) iteration.
 * @author Sean A. Irvine
 */
public class A127824 extends Sequence0 {

  private final Set<Z> mSeen = new HashSet<>();
  protected final TreeSet<Z> mA = new TreeSet<>(); // version used to report
  private HashSet<Z> mB = new HashSet<>(); // keeps state

  protected void step() {
    if (mB.isEmpty()) {
      mSeen.add(Z.ZERO);
      mSeen.add(Z.ONE);
      mB.add(Z.ONE);
    } else {
      final HashSet<Z> next = new HashSet<>();
      for (final Z v : mB) {
        final Z v2 = v.multiply2();
        if (mSeen.add(v2)) {
          next.add(v2);
        }
        if (v.mod(6) == 4) {
          final Z u = v.divide(3);
          if (mSeen.add(u)) {
            next.add(u);
          }
        }
      }
      mB = next;
    }
    mA.clear(); // safety
    mA.addAll(mB);
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      step();
    }
    return mA.pollFirst();
  }
}
