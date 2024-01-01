package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence3;

/**
 * A067634 a(1) = 1; string of digits of a(n)^2 is a substring of the string of digits of a(n+1)^2.
 * @author Sean A. Irvine
 */
public class A067634 extends PrependSequence {

  /** Construct the sequence. */
  public A067634() {
    super(new Sequence3() {
      private Z mA = null;
      @Override
      public Z next() {
        mA = mA == null ? Z.valueOf(13) : mA.multiply(10);
        return mA;
      }
    }, 1, 4);
  }
}
