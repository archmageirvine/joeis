package irvine.oeis.a360;
// Generated by gen_seq4.pl holdfin/holos at 2023-05-05 23:15

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360149 a(n) = Sum_{k=0..floor(n/2)} binomial(2*n+k,n-2*k).
 * @author Georg Fischer
 */
public class A360149 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360149() {
    super(0, "[[0],[-396,-2828,648],[7962,7800,-2566],[-27492,919,3089],[32286,-18776,-330],[-6378,8567,-261],[0,-1011,47]]", "1,2,7,27,107,429,1731,7012,28478,115864,471991", 0);
  }
}
