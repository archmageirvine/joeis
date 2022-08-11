package irvine.oeis.a091;
// manually rectoproc/holos at 2022-08-11 09:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A091484 Recam\u00e1n's Fibonacci variation : a(1)=a(2)=1 then a(n) = a(n-1)+a(n-2)-F(n) if that number is &gt;0 and not already in the sequence; a(n) = a(n-1)+a(n-2)+F(n) otherwise where F(n) denotes the n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A091484 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A091484() {
    super(1, "[[0],[1],[0],[0],[0],[-7],[0],[0],[0],[1]]", "1, 1, 4, 2, 11, 5, 3, 29, 66, 40", 0);
  }
}
