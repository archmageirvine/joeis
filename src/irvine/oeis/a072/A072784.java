package irvine.oeis.a072;

import irvine.oeis.Combiner;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072784 extends Combiner {

  /** Construct the sequence. */
  public A072784() {
    super(0, new A072741(), new A072737(), SUBTRACT);
  }
}
