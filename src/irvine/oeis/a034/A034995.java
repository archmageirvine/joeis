package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034995 Smallest square starting with a string of n 9's.
 * @author Sean A. Irvine
 */
public class A034995 extends A034994 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
