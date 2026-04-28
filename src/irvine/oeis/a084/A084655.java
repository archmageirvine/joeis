package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084655 Largest prime factor of pseudoprimes in A084653.
 * @author Sean A. Irvine
 */
public class A084655 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084655() {
    super(new A084653(), Functions.GPF::z);
  }
}
