package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence0;

/**
 * A082274 Palindromes k such that k + 2 is also a palindrome.
 * @author Sean A. Irvine
 */
public class A082274 extends PrependSequence {

  /** Construct the sequence. */
  public A082274() {
    super(1, new Sequence0() {
      private Z mA = Z.ZERO;

      @Override
      public Z next() {
        mA = mA.multiply(10).add(9);
        return mA;
      }
    }, 1, 2, 3, 4, 5, 6, 7);
  }
}
