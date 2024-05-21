package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a064.A064848;

/**
 * A065029 Numbers k such that the period of the continued fraction for sqrt(2)*k (A064848) is 2.
 * @author Sean A. Irvine
 */
public class A065029 extends FilterPositionSequence {

  private static final A064848 A064848 = new A064848();

  /** Construct the sequence. */
  public A065029() {
    super(1, A064848, Z.TWO::equals);
    A064848.setPeriodLimit(3);
  }
}

