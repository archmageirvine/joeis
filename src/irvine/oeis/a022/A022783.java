package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a023.A023121;

/**
 * A022783.
 * @author Sean A. Irvine
 */
public class A022783 extends A023121 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
