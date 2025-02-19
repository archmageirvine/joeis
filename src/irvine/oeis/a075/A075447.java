package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075447 Denominator of A075443(n)/A000010(n).
 * @author Sean A. Irvine
 */
public class A075447 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075447() {
    super(1, new A075443().skip(), (n, k) -> new Q(k, Functions.PHI.z(n)).den());
  }
}
