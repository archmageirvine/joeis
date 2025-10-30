package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a384.A384237;

/**
 * A081418.
 * @author Sean A. Irvine
 */
public class A390097 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A390097() {
    super(1, 1, new A384237(), (n, k) -> k.equals(Functions.SIGMA0.z(n)));
  }
}
