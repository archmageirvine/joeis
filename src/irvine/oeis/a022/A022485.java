package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022485 Number of <code>2</code>'s in n-th term of <code>A022482</code>.
 * @author Sean A. Irvine
 */
public class A022485 extends A022482 {

  @Override
  public Z next() {
    return Z.valueOf(A022477.count(super.next(), Z.TWO));
  }
}
