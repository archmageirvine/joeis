package irvine.oeis.a140;
// Generated by gen_seq4.pl holos [[0],[-1],[1],[4],[-4],[-6],[6],[4],[-4],[-1],[1]] [1,2,29,30,155,156,499,500,1229,1230] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A140152 a(1)=1, a(n)=a(n-1)+n^3 if n odd, a(n)=a(n-1)+ n^0 if n is even.
 * @author Georg Fischer
 */
public class A140152 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A140152() {
    super(1, "[[0],[-1],[1],[4],[-4],[-6],[6],[4],[-4],[-1],[1]]", "[1,2,29,30,155,156,499,500,1229,1230]", 0);
  }
}
