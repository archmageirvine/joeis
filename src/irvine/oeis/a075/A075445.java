package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075445 a(n) = gcd(A075443(n), A000010(n)).
 * @author Sean A. Irvine
 */
public class A075445 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075445() {
    super(1, new A075443().skip(), (n, k) -> k.gcd(Functions.PHI.z(n)));
  }
}
