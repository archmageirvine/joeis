package irvine.oeis.a141;
// Generated by gen_seq4.pl 2025-06-15.ack/holos at 2025-06-15 21:33

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A141828 a(n) = (n^4*a(n-1)-1)/(n-1) for n &gt;= 2, with a(0) = 1, a(1) = 5.
 * a(n) = (n^4*a(n-1)-1)/(n-1) for n >= 2, with a(0) = 1, a(1) = 5.
 * @author Georg Fischer
 */
public class A141828 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A141828() {
    super(0, "[[-1],[0,0,0,0,1],[1,-1]]", "1,5", 0, 0);
  }
}
