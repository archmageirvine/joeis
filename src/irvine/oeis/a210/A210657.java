package irvine.oeis.a210;
// manually egfsi at 2022-04-29 12:55

import irvine.math.z.Z;
import irvine.oeis.a002.A002114;

/**
 * A210657 a(0)=1; thereafter a(n) = -2*Sum_{k=1..n} binomial(2n,2k)*a(n-k).
 * @author Georg Fischer
 */
public class A210657 extends A002114 {

  {
    setOffset(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    return (((mN & 1) == 0) ? super.next() : super.next().negate()).multiply2();
  }
}
