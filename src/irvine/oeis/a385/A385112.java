package irvine.oeis.a385;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a368.A368507;

/**
 * A385112 Powers of superprimorials that are not powers of 2.
 * @author Sean A. Irvine
 */
public class A385112 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A385112() {
    super(1, new A368507(), new A000079());
  }
}
