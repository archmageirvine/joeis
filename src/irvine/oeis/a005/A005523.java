package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A005523 <code>a(n) =</code> maximal number of rational points on an elliptic curve over GF(q), where q = A246655(n) is the n-th prime power <code>&gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A005523 extends A000961 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z q = super.next();
    return q.add(1).add(q.multiply(4).sqrt());
  }
}
