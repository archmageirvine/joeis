package irvine.oeis.a385;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a097.A097893;

/**
 * A385641 Partial sums of A097893.
 * @author Sean A. Irvine
 */
public class A385641 extends PartialSumSequence {

  /** Construct the sequence. */
  public A385641() {
    super(0, new A097893());
  }
}

