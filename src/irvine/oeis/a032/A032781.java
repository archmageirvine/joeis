package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032781 Floor ( n(n+1)(n+2)...(n+9) / (n+(n+1)+(n+2)+...+(n+9)) ).
 * @author Sean A. Irvine
 */
public class A032781 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN)
      .multiply(mN + 1)
      .multiply(mN + 2)
      .multiply(mN + 3)
      .multiply(mN + 4)
      .multiply(mN + 5)
      .multiply(mN + 6)
      .multiply(mN + 7)
      .multiply(mN + 8)
      .multiply(mN + 9)
      .divide(10 * mN + 45);
  }
}
