package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067321 One-half of odd-indexed members of A067297.
 * @author Sean A. Irvine
 */
public class A067321 extends A067297 {

  @Override
  public Z next() {
    super.next();
    return super.next().divide2();
  }
}

