package irvine.oeis.a326;
// manually holsig/holos at 2022-09-29 22:19

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A326507 Number of (binary) max-heaps on n elements from the set {0,1} containing exactly six 0's.
 * @author Georg Fischer
 */
public class A326507 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A326507() {
    super(6, "[0,1,-1,-2,2,-3,3,8,-8,2,-2,-12,12,2,-2,8,-8,-3,3,-2,2,1,-1]", "1,1,2,5,9,16,27,44,68,114,156,236,325,500,622,900,1143,1659,1954,2731,3277", 0);
  }
}
