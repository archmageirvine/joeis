package irvine.oeis.a188;
// Generated by gen_seq4.pl holos [[0],[-375,2090,-3541,2546,-816,96],[1896,-10521,18286,-13668,4608,-576],[960,-6625,12465,-9970,3600,-480],[849,-5457,11414,-10212,4032,-576],[0,338,-1229,1394,-624,96]] [1,2,11,63,376,2317] 0 at 2020-03-14 22:45
// Recurrence: (n-2)*n*(2*n-1)*(48*n^2-192*n+169)*a[n+0]=(576*n^5-4032*n^4+10212*n^3-11414*n^2+5457*n-849)*a[n-1]+5*(2*n-3)*(48*n^4-288*n^3+565*n^2-399*n+64)*a[n-2]+(576*n^5-4608*n^4+13668*n^3-18286*n^2+10521*n-1896)*a[n-3]-(n-3)*(n-1)*(2*n-5)*(48*n^2-96*n+25)*a[n-4]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A188648 Binomial sums a(n) = Sum_{k=0..n} (binomial(2n-k,k))^2.
 * @author Georg Fischer
 */
public class A188648 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A188648() {
    super(0, "[[0],[-375,2090,-3541,2546,-816,96],[1896,-10521,18286,-13668,4608,-576],[960,-6625,12465,-9970,3600,-480],[849,-5457,11414,-10212,4032,-576],[0,338,-1229,1394,-624,96]]", "[1,2,11,63,376,2317]", 0);
  }
}
