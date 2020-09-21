package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034991 Smallest square starting with a string of n 7's.
 * @author Sean A. Irvine
 */
public class A034991 extends A034990 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
