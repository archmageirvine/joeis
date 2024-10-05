package irvine.oeis.a072;

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a033.A033677;

/**
 * A072106.
 * @author Sean A. Irvine
 */
public class A072489 extends PartialProductSequence {

  /** Construct the sequence. */
  public A072489() {
    super(1, new A033677());
  }
}

