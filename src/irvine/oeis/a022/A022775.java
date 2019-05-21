package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a007.A007336;

/**
 * A022775 Place where <code>n-th 1</code> occurs in <code>A007336</code>.
 * @author Sean A. Irvine
 */
public class A022775 extends A007336 {

  private long mN = 0;

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      ++mN;
    }
    return Z.valueOf(++mN);
  }
}
