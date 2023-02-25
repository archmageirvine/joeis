package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a060.A060840;

/**
 * A060284.
 * @author Sean A. Irvine
 */
public class A061569 extends Combiner {

  /** Construct the sequence. */
  public A061569() {
    super(1, new SkipSequence(new A000041(), 1), new A060840(), SUBTRACT);
  }
}

