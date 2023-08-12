package irvine.oeis.a065;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005132;

/**
 * A065056 Partial sums of Recam\u00e1n's sequence A005132.
 * @author Sean A. Irvine
 */
public class A065056 extends PartialSumSequence {

  /** Construct the sequence. */
  public A065056() {
    super(0, new A005132());
  }
}

