package irvine.oeis.a064;
// Generated by gen_seq4.pl holos at 2021-07-06 21:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A064328 Generalized Catalan numbers C(-6; n).
 * radtorec(1/(13/12-1/12*(24*x+1)^(1/2)))
 * @author Georg Fischer
 */
public class A064328 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A064328() {
    super(0, "[[0],[-36, 24],[252,-167],[0,-7]]", "[1, 1]", 0);
  }
}
