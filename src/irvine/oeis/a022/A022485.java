package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022485 Number of 2's in n-th term of A022482.
 * @author Sean A. Irvine
 */
public class A022485 extends A022482 {

  @Override
  public Z next() {
    return Z.valueOf(A022477.count(super.next(), Z.TWO));
  }
}
