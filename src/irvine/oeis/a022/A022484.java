package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022484 Number of 1's in n-th term of A022482.
 * @author Sean A. Irvine
 */
public class A022484 extends A022482 {

  @Override
  public Z next() {
    return Z.valueOf(A022477.count(super.next(), Z.ONE));
  }
}
