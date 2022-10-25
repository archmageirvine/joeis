package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a202.A202342;

/**
 * A020942 First column of 3rd-order Zeckendorf array.
 * @author Sean A. Irvine
 */
public class A020942 extends A202342 {

  {
    setOffset(1);
  }

  // Conjecture

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}
