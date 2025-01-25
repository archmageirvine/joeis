package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000045;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074698 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074698() {
    super(1, 1, new A000045().skip(), (n, k) -> Functions.SIGMA0.z(k).mod(n) == 0);
  }
}
