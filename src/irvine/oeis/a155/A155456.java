package irvine.oeis.a155;
// manually deris2/essent 0 A000142 at 2021-11-04 15:02
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A155456 Write (1+1/x)*log(1+x) = Sum c(n)*x^n; then a(n) = (n+1)!*c(n).
 * Apart from initial terms and signs, identical to A000142.
 * @author Georg Fischer
 */
public class A155456 extends A000142 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.NEG_ONE : (mN & 1) == 1 ? super.next().negate() : super.next();
  }
}
