package irvine.oeis.a326;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A326506 Number of (binary) max-heaps on n elements from the set {0,1} containing exactly five 0's.
 * @author Georg Fischer
 */
public class A326506 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A326506() {
    super(5, "[0,-1,1,2,-2,2,-2,-6,6,0,0,6,-6,-2,2,-2,2,1,-1]", "1,1,2,5,8,13,24,34,52,74,116,145,211,270,392,460,643", 0);
  }
}
