package irvine.oeis.a347;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A347107 a(n) = Sum_{1 &lt;= i &lt; j &lt;= n} j^3*i^3.
 * @author Georg Fischer
 */
public class A347107 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A347107() {
    super(0, "[0,1,-9,36,-84,126,-126,84,-36,9,-1]", "0,0,8,251,2555,15055,63655,214918,616326,1561110", 0);
  }
}
