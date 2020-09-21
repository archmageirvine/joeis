package irvine.oeis.a034;

import irvine.math.z.Z;

/**
 * A034983 Smallest square starting with a string of n 3's.
 * @author Sean A. Irvine
 */
public class A034983 extends A034982 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
