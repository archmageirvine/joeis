package irvine.oeis.a065;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a064.A064492;

/**
 * A065053 Lengths of intervals between special points in Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A065053 extends DifferenceSequence {

  /** Construct the sequence. */
  public A065053() {
    super(1, new A064492());
  }
}

