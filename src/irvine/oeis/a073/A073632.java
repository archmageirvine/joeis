package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002379;

/**
 * A073632 Numbers k such that floor((3/2)^k) = A002379(k) is odd.
 * @author Sean A. Irvine
 */
public class A073632 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073632() {
    super(1, 0, new A002379(), Z::isOdd);
  }
}
