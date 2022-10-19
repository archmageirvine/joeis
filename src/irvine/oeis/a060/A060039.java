package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060039 Triangle T(n,k) = 1 if k-th prime is a square mod the n-th prime, otherwise 0, for 1&lt;=k&lt;n.
 * @author Sean A. Irvine
 */
public class A060039 extends A060038 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
