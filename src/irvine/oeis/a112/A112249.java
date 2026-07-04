package irvine.oeis.a112;

import irvine.math.LongUtils;
import irvine.oeis.FilterNumberSequence;

/**
 * A112249 Numbers m such that m mod floor(log_2(m)) = 0.
 * @author Sean A. Irvine
 */
public class A112249 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A112249() {
    super(1, 2, k -> k % LongUtils.floorLog2(k) == 0);
  }
}
