package irvine.oeis.a360;
// Generated by gen_seq4.pl satishol/holos at 2023-05-06 21:48

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360101 a(n) = Sum_{k=0..n} binomial(n+4*k-1,n-k) * Catalan(k).
 * @author Georg Fischer
 */
public class A360101 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360101() {
    super(0, "[[0],[384,-80,4],[-1974,471,-27],[4110,-1147,77],[-4380,1471,-119],[3228,-1259,121],[-1014,601,-77],[66,-51,15],[0,-5,7],[0,-1,-1]]", "[1,1,7,40,234,1432,9078,59113]", 0);
  }
}
