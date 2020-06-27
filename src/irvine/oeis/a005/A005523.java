package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a246.A246655;

/**
 * A005523 <code>a(n) =</code> maximal number of rational points on an elliptic curve over <code>GF(q)</code>, where q <code>= A246655(n)</code> is the n-th prime power <code>&gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A005523 extends A246655 {

  @Override
  public Z next() {
    final Z q = super.next();
    return q.add(1).add(q.multiply(4).sqrt()); // Hasse theorem (upper bound)
  }
}
