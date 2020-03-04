package irvine.oeis.a029;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005001;

/**
 * A029761 Partial sums of <code>A005001</code>.
 * @author Sean A. Irvine
 */
public class A029761 extends PartialSumSequence {

  /** Construct the sequence. */
  public A029761() {
    super(new SkipSequence(new A005001(), 1));
  }
}
