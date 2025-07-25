package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-06-22.ack/holos at 2025-06-22 22:11

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A383629 Expansion of 1/( Product_{k=0..4} (1 - (5*k+1) * x) )^(1/5).
 * 1/((1-x)*(1-6*x)*(1-11*x)*(1-16*x)*(1-21*x))^(1/5)
 * @author Georg Fischer
 */
public class A383629 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A383629() {
    super(0, "[[0],[-88704,22176],[97056,-30330],[-22044,9185],[1736,-1085],[-44,55],[0,-1]]", "1", 0, 0);
  }
}
