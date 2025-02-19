package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a002.A002379;

/**
 * A073634 Numbers k such that floor((3/2)^k) = A002379(k) is even.
 * @author Sean A. Irvine
 */
public class A073634 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073634() {
    super(1, 0, new A002379(), Z::isEven);
  }
}
