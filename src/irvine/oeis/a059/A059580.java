package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059580 Main diagonal of the array A059579.
 * @author Sean A. Irvine
 */
public class A059580 extends A059578 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
