package irvine.oeis.a360;
// Generated by gen_seq4.pl satishol/holos at 2023-05-06 21:48

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360026 a(n) = Sum_{k=0..floor(n/4)} (-1)^k * binomial(n-3*k,k) * Catalan(k).
 * @author Georg Fischer
 */
public class A360026 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360026() {
    super(0, "[[0],[84,-66,12],[-72,100,-28],[0,-32,16],[6,3,-3],[-24,8,10],[18,-27,-11],[0,16,4]]", "[1,1,1,1,0,-1]", 0);
  }
}
