package irvine.oeis.a335;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A335090 a(n) = ((2*n+1)!!)^2 * (Sum_{k=1..n} 1/(2*k+1)^2).
 * @author Georg Fischer
 */
public class A335090 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A335090() {
    super(0, "[[0],[-1,8,-24,32,-16],[2,0,8],[-1]]", "0,1,34,1891,164196,20760741,3616621254,832001250375", 0);
  }
}
