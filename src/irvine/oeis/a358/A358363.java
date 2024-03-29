package irvine.oeis.a358;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358363 a(n) = 16^n * Sum_{k=0..n} (-1)^k*binomial(1/2, k)^2.
 * @author Georg Fischer
 */
public class A358363 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358363() {
    super(0, "[[0],[576,-768,256],[-36,48],[0,0,-1]]", "1,12,196,3120,50020,799536,12799632,204724416", 0);
  }
}
