package irvine.oeis.a331;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A331029 Least integer of each composite prime signature where primes ending in 1 or 9 are treated distinctly from those ending in 3 or 7.
 * @author Sean A. Irvine
 */
public class A331029 extends MultiplicativeClosureSequence {

  private static class Generators extends Sequence1 {
    private final Fast mPrime = new Fast();
    private long mP37 = 2;
    private long mP19 = 2;
    private Z mProd37 = Z.ONE;
    private Z mProd19 = Z.ONE;
    private Z mNext37 = null;
    private Z mNext19 = null;

    private void advance37() {
      while (true) {
        mP37 = mPrime.nextPrime(mP37);
        if (Math.abs(mP37 % 10 - 5) == 2) {
          mProd37 = mProd37.multiply(mP37);
          mNext37 = mProd37;
          return;
        }
      }
    }

    private void advance19() {
      while (true) {
        mP19 = mPrime.nextPrime(mP19);
        if (Math.abs(mP19 % 10 - 5) == 4) {
          mProd19 = mProd19.multiply(mP19);
          mNext19 = mProd19;
          return;
        }
      }
    }

    @Override
    public Z next() {
      if (mNext37 == null) {
        advance37();
      }
      if (mNext19 == null) {
        advance19();
      }

      final Z t;
      if (mNext37.compareTo(mNext19) <= 0) {
        t = mNext37;
        advance37();
      } else {
        t = mNext19;
        advance19();
      }
      return t;
    }
  }

  /** Construct the sequence. */
  public A331029() {
    super(1, new Generators());
  }
}
