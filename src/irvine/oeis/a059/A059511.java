package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059511 Main diagonal of the array A059217.
 * @author Sean A. Irvine
 */
public class A059511 extends A059216 {

  private int mN = -1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
