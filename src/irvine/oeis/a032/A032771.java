package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032771 [ n(n+1)(n+2)...(n+5) / (n+(n+1)+(n+2)+...+(n+5)) ].
 * @author Sean A. Irvine
 */
public class A032771 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN)
      .multiply(mN + 1)
      .multiply(mN + 2)
      .multiply(mN + 3)
      .multiply(mN + 4)
      .multiply(mN + 5)
      .divide(6 * mN + 15);
  }
}
