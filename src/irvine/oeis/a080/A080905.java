package irvine.oeis.a080;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A080905 Sequence of run lengths in first differences of A080900.
 * @author Sean A. Irvine
 */
public class A080905 extends RunLengthTransform {

  /** Construct the sequence. */
  public A080905() {
    super(1, new DifferenceSequence(new A080900()));
  }
}

