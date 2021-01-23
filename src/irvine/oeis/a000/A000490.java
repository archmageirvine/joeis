package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000490 Generalized Euler numbers c(4,n).
 * @author Sean A. Irvine
 */
public class A000490 extends A000364 {

  @Override
  public Z next() {
    return super.next().shiftLeft(4 * mN);
  }
}
