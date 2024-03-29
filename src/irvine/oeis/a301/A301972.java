package irvine.oeis.a301;
// Generated by gen_seq4.pl holos [[0],[-32676,48664,-17920],[-18672,-17656,8324],[6430,1293,-961]] [0,1,4] 0 at 2020-02-15 22:07
// Recurrence: -(n+2)*(961*n-3215)*a[n+0]+4*(2081*n^2-4414*n-4668)*a[n-1]-28*(320*n-389)*(2*n-3)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A301972 a(n) = n*(n^2 - 2*n + 4)*binomial(2*n,n)/((n + 1)*(n + 2)).
 * @author Georg Fischer
 */
public class A301972 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A301972() {
    super(0, "[[0],[-32676,48664,-17920],[-18672,-17656,8324],[6430,1293,-961]]", "[0,1,4]", 0);
  }
}
