package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a034.A034851;

/**
 * A062136 Twelfth column of Losanitsch's triangle A034851 (formatted as lower triangular matrix).
 * @author Sean A. Irvine
 */
public class A062136 extends A034851 {

  private long mN = 10;

  @Override
  public Z next() {
    return t(++mN, 11);
  }
}
