package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035509 Main diagonal of Inverse Stolarsky array.
 * @author Sean A. Irvine
 */
public class A035509 extends A035507 {

  private long mN = 0;

  @Override
  public Z next() {
    return inverseStolarsky(++mN, mN);
  }
}

