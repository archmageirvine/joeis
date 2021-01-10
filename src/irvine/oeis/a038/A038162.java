package irvine.oeis.a038;

import irvine.oeis.ComplementSequence;

/**
 * A038162 Numbers missing from A038161.
 * @author Sean A. Irvine
 */
public class A038162 extends ComplementSequence {

  /** Construct the sequence. */
  public A038162() {
    super(new A038161());
  }
}
