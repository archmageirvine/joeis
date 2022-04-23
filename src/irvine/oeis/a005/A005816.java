package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a333.A333467;

/**
 * A005816 Number of 4-valent labeled graphs with n nodes where multiple edges and loops are allowed.
 * @author Sean A. Irvine
 */
public class A005816 extends A333467 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 4);
  }
}
