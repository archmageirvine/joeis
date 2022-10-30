package irvine.oeis.a029;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002034;

/**
 * A029716 Partial sums of Kempner numbers A002034.
 * @author Sean A. Irvine
 */
public class A029716 extends PartialSumSequence {

  /** Construct the sequence. */
  public A029716() {
    super(1, new A002034());
  }
}
