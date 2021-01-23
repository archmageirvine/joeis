package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034993 Smallest square starting with a string of n 8's.
 * @author Sean A. Irvine
 */
public class A034993 extends A034992 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
