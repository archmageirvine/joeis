package irvine.oeis.a048;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a003.A003188;

/**
 * A048641 Partial sums of A003188 (Gray code).
 * @author Sean A. Irvine
 */
public class A048641 extends PartialSumSequence {

  /** Construct the sequence. */
  public A048641() {
    super(1, new A003188());
  }
}

