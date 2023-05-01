package irvine.oeis.a105;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105051 Define a(1)=0, a(2)=0, a(3)=15, a(4)=111 then a(n) = 254*a(n-2) - a(n-4) + 126 also sequence such that 7*a(n)*(a(n) + 1) + 1 = a square.
 * @author Georg Fischer
 */
public class A105051 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105051() {
    super(0, "[0,1,-1,-254,254,1,-1]", "0,0,15,111,3936", 0);
  }
}
