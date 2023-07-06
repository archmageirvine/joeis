package irvine.oeis.a029;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a005.A005001;

/**
 * A029761 Partial sums of A005001.
 * @author Sean A. Irvine
 */
public class A029761 extends PartialSumSequence {

  /** Construct the sequence. */
  public A029761() {
    super(new A005001().skip(1));
  }
}
