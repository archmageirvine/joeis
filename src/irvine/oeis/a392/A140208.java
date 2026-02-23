package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.a128.A128913;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A140208 a(n) = floor(n*pi(n)/2) where pi(n) is the number of primes &lt;= n.
 * @author Sean A. Irvine
 */
public class A140208 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A140208() {
    super(1, new A128913(), Z::divide2);
  }
}
