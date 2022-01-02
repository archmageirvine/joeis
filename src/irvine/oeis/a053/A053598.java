package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000273;

/**
 * A053598 Number of n-node unlabeled digraphs without isolated nodes.
 * @author Sean A. Irvine
 */
public class A053598 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053598() {
    super(new PrependSequence(new A000273(), 0));
  }
}
