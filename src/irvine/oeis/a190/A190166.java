package irvine.oeis.a190;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A190166 Number of (1,0)-steps at levels 0,2,4,... in all peakless Motzkin paths of length n.
 * @author Georg Fischer
 */
public class A190166 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190166() {
    super(0, "[[0],[-3,1],[8,-3],[-6,2],[6,-3],[-2,2],[4,-3],[-1,1]]", "0,1", 0);
  }
}
