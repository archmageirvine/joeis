package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a246.A246655;

/**
 * A005523 a(n) = maximal number of rational points on an elliptic curve over GF(q), where q = A246655(n) is the n-th prime power &gt; 1.
 * @author Sean A. Irvine
 */
public class A005523 extends A246655 {

  @Override
  public Z next() {
    final Z q = super.next();
    return q.add(1).add(q.multiply(4).sqrt()); // Hasse theorem (upper bound)
  }
}
