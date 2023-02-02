package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A119428 G.f.: A(x) = 1 + Sum_{n&gt;=0} (-1)^n* Sum_{k=1..4} x^(5n+k)/(1-x^(5n+k)).
 * @author Georg Fischer
 */
public class A119428 extends EulerTransform {

  /** Construct the sequence. */
  public A119428() {
    super(0, new PeriodicSequence(1, 1, 0, 0,-2, 0, 0, 1, 1,-2), 1);
  }
}
