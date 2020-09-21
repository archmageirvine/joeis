package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034989 Smallest squares starting with a string of n 6's.
 * @author Sean A. Irvine
 */
public class A034989 extends A034988 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
