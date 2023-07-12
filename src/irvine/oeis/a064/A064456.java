package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A064456 A064434(n) = 0.
 * @author Sean A. Irvine
 */
public class A064456 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064456() {
    super(1, new A064434(), Z::isZero);
  }
}
