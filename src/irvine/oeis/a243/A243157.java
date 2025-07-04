package irvine.oeis.a243;
// Generated by gen_seq4.pl 2025-06-25.ack/holos at 2025-06-25 23:22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A243157 Series reversion of x*(1 - x)/(1 - x - x^3).
 * @author Georg Fischer
 */
public class A243157 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A243157() {
    super(1, "[[0],[10230,-3751,341],[-2880,1371,-159],[-870,344,-28],[756,-513,81],[-102,132,-36],[0,-9,9],[0,-1,-1]]", "1,0,0,-1", 0, 0);
  }
}
