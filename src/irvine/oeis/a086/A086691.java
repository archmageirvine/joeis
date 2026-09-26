package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086691 Numbers n such that all of {n, pi(n), prime(n)} have the same decimal digits (ignoring multiplicity).
 * @author Sean A. Irvine
 */
public class A086691 extends A000040 {

  private long mN = 0;
  private long mPi = 0;
  private int mSynPi = 0;

  @Override
  public Z next() {
    while (true) {
      if (Predicates.PRIME.is(++mN)) {
        mSynPi = Functions.SYNDROME.i(++mPi);
      }
      if (Functions.SYNDROME.i(super.next()) == mSynPi && Functions.SYNDROME.i(mN) == mSynPi) {
        return Z.valueOf(mN);
      }
    }
  }
}

