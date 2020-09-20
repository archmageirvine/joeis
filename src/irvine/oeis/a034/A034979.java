package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034979 Smallest square starting with a string of n 1's.
 * @author Sean A. Irvine
 */
public class A034979 extends A034978 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
