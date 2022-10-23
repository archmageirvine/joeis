package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A032777 Floor( n(n+1)(n+2)...(n+7) / (n+(n+1)+(n+2)+...+(n+7)) ).
 * @author Sean A. Irvine
 */
public class A032777 extends Sequence0 {

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
      .divide(8 * mN + 28);
  }
}
