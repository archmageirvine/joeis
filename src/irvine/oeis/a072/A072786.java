package irvine.oeis.a072;

import irvine.oeis.Combiner;

/**
 * A072786 Differences between A072782 and A072739.
 * @author Sean A. Irvine
 */
public class A072786 extends Combiner {

  /** Construct the sequence. */
  public A072786() {
    super(0, new A072782(), new A072739(), SUBTRACT);
  }
}
