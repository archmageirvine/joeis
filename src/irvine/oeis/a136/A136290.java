package irvine.oeis.a136;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A136290 a(0)=1, a(1)=3, a(2)=9, a(3)=12, a(4)=15; thereafter a(n) = a(n-1) + a(n-3) - a(n-4).
 * @author Georg Fischer
 */
public class A136290 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A136290() {
    super(0, "[0, 1,-1, 0,-1, 1]", "[1, 3, 9, 12, 15, 21]", 0);
  }
}
