package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034985 Smallest square starting with a string of n 4's.
 * @author Sean A. Irvine
 */
public class A034985 extends A034984 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
