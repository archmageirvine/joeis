package irvine.oeis.a361;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361263 Numbers of the form k*(k^5 +- 1)/2.
 * @author Georg Fischer
 */
public class A361263 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361263() {
    super(1, "[0,1,-1,-6,6,15,-15,-20,20,15,-15,-6,6,1,-1]", "0,1,31,33,363,366,2046,2050,7810,7815", 0);
  }
}
