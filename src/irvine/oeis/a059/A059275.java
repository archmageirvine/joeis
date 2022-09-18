package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059275 Transform of A059226 applied to sequence 1, 1, 1, 1, 1, 1, 1, ...
 * @author Sean A. Irvine
 */
public class A059275 extends A059274 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
