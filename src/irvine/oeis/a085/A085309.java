package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A085309 Initial values providing nontrivial cyclic attractor when function defined in A085307 is iterated.
 * @author Sean A. Irvine
 */
public class A085309 extends Sequence1 {

  private final boolean mHeuristic = "true".equals(System.getProperty("oeis.a085309.heuristic"));
  private final DirectSequence mA = new A085307();
  private long mN = 211;

  private boolean is(final long n) {
    final HashSet<Z> seen = new HashSet<>();
    Z t = Z.valueOf(n);
    while (seen.add(t)) {
      if (t.isProbablePrime()) {
        return false;
      }
      if (mHeuristic) {
        try {
          t = mA.a(t);
        } catch (final UnsupportedOperationException e) {
          return false;
        }
      } else {
        t = mA.a(t);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
