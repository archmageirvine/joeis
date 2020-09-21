package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034981 Smallest square starting with a string of n 2's.
 * @author Sean A. Irvine
 */
public class A034981 extends A034980 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
