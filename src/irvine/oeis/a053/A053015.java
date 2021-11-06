package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a089.A089210;

/**
 * A053015 A089210 prefixed by an initial zero.
 * @author Georg Fischer
 */
public class A053015 extends A089210 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
