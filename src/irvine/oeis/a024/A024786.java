package irvine.oeis.a024;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000097;

/**
 * A024786 Number of <code>2</code>'s in all partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A024786 extends DifferenceSequence {

  /** Construct the sequence. */
  public A024786() {
    super(new PrependSequence(new A000097(), 0, 0));
  }
}
