package irvine.oeis.a388;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A388655 allocated for Daniel Hoyt.
 * @author Sean A. Irvine
 */
public class A388655 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A388655() {
    super(0, new A388852());
  }
}
