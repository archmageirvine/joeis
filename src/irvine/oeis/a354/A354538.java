package irvine.oeis.a354;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354538 a(n) is the least k such that A322523(k) = n.
 * @author Georg Fischer
 */
public class A354538 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354538() {
    super(0, "[[0],[-3],[4],[-1]]", "1,3,8,17", 0);
  }
}
