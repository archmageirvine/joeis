package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;

/**
 * A077487 Squares which leave a square at every step if most significant digit and least significant digit are deleted until a one-digit or two-digit square is obtained.
 * @author Sean A. Irvine
 */
public class A077487 extends UnionSequence {

  /** Construct the sequence. */
  public A077487() {
    super(1,
      new FilterSequence(new A077485(), FilterSequence.NONZERO),
      new FilterSequence(new A077486(), FilterSequence.NONZERO),
      new FiniteSequence(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 144, 196, 400, 441, 841, 900, 1369, 3364, 4096, 5041, 8649, 10000, 10816, 11449, 20164, 38416, 40000, 61009, 64009, 90000, 1000000, 1004004, 3013696, 3108169),
      new Sequence0() {
        private Z mA = Z.FOUR;
        @Override
        public Z next() {
          mA = mA.multiply(100);
          return mA;
        }
      },
    new Sequence0() {
      private Z mA = Z.NINE;
      @Override
      public Z next() {
        mA = mA.multiply(100);
        return mA;
      }
    }
    );
  }

}

