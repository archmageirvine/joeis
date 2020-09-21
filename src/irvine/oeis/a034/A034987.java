package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034987 Smallest square starting with a string of n 5's.
 * @author Sean A. Irvine
 */
public class A034987 extends A034986 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
