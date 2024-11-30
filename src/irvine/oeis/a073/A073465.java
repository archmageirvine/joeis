package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073465 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A073465() {
    super(1, 2, new A073464(), Z::isZero);
  }
}
