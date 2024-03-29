package irvine.oeis.a166;
// Generated by gen_seq4.pl holdfin/holos at 2023-05-05 23:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A166337 a(n)=(2n+0^n)*C(4n,2n).
 * @author Georg Fischer
 */
public class A166337 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166337() {
    super(0, "[[0],[-6,32,-32],[1,-3,2]]", "1,12,280,5544,102960,1847560,32449872", 0);
  }
}
