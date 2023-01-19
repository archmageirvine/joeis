package irvine.oeis.a152;

import irvine.math.z.Z;
import irvine.oeis.a058.A058096;

/**
 * A152954 McKay-Thompson series of class 9d for the Monster group with a(0) = -2.
 * @author Georg Fischer
 */
public class A152954 extends A058096 {

  private int mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 0) ? Z.valueOf(-2) : result;
  }
}
