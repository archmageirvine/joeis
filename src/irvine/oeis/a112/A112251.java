package irvine.oeis.a112;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A112251 Numbers m such that m mod log_2(m) = 1.
 * @author Sean A. Irvine
 */
public class A112251 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A112251() {
    super(1, 2, k -> k % LongUtils.floorLog2(k) == 1);
  }
}
