package irvine.oeis.a055;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a144.A144494;

/**
 * A055636 Partial sums of A144494.
 * @author Sean A. Irvine
 */
public class A055636 extends PartialSumSequence {

  /** Construct the sequence. */
  public A055636() {
    super(1, new A144494());
  }
}

