package irvine.oeis.a072;

import irvine.oeis.Combiner;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072783 extends Combiner {

  /** Construct the sequence. */
  public A072783() {
    super(0, new A072740(), new A072736(), SUBTRACT);
  }
}
