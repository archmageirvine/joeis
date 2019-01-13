package irvine.oeis.a005;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000110;

/**
 * A005493.
 * @author Sean A. Irvine
 */
public class A005493 extends DifferenceSequence {

  /** Construct the sequence. */
  public A005493() {
    super(new SkipSequence(new A000110(), 1));
  }
}

