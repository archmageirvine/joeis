package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a065.A065358;

/**
 * A064940 Values of k for which A065358(k) is 0.
 * @author Sean A. Irvine
 */
public class A064940 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A064940() {
    super(1, 0, new A065358(), Z::isZero);
  }
}
