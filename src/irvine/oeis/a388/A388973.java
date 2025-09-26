package irvine.oeis.a388;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a049.A049419;

/**
 * A388973 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A388973 extends FilterSequence {

  /** Construct the sequence. */
  public A388973() {
    super(1, new A049419(), Predicates.POWER_OF_TWO::is);
  }
}

