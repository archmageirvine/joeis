package irvine.oeis.a358;
// Generated by gen_seq4.pl holgrep/holos at 2023-05-08 18:43

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A358365 a(n) = 16^n * Sum_{k=0..n} binomial(-1/2, k)^2.
 * @author Georg Fischer
 */
public class A358365 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A358365() {
    super(0, "[[0],[-64,256,-256],[4,-16,32],[0,0,-1]]", "1,20,356,6096,102436,1702480,28093456,461273920", 0);
  }
}
