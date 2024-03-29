package irvine.oeis.a228;
// Generated by gen_seq4.pl rectoproc/holos at 2022-08-11 18:04

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A228514 a(n) = Sum_{k=0..n} binomial(n,k)^2*binomial(2k,k+1).
 * @author Georg Fischer
 */
public class A228514 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A228514() {
    super(0, "[[0],[-9, 9, 9,-9],[0,-4, 0, 10],[1, 1,-1,-1]]", "0, 1", 0);
  }
}
