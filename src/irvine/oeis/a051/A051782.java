package irvine.oeis.a051;

import irvine.oeis.a000.A000108;
import irvine.oeis.transform.StirlingBernoulliTransform;

/**
 * A051782 Apply the "Stirling-Bernoulli transform" to Catalan numbers.
 * @author Sean A. Irvine
 */
public class A051782 extends StirlingBernoulliTransform {

  /** Construct the sequence. */
  public A051782() {
    super(new A000108());
  }
}
