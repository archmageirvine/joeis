package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057519 The local ranks of each term of A057517.
 * @author Sean A. Irvine
 */
public class A057519 extends A057517 {

  @Override
  public Z next() {
    final Z n = super.next();
    return A057121.catalanRank(n.bitLength() / 2, n);
  }
}
