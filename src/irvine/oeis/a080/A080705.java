package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.FilterPositionSequence;

/**
 * A080705 Numbers n such that A080704(n+1) - A080704(n) = 1.
 * @author Sean A. Irvine
 */
public class A080705 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080705() {
    super(1, new DifferenceSequence(new A080704()), Z::isOne);
  }
}
