package irvine.oeis.a089;
// Generated by gen_seq4.pl holos [[0],[36,-42,12],[11,-8],[1]] [1,5,47] 0 at 2020-02-15 22:07
// Recurrence: a[n+0]+(-8*n+11)*a[n-1]+6*(2*n-3)*(n-2)*a[n-2]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089155 a(n) = (2*n)!*(Integral_{x=0..sqrt(2/3)} 1/(1-x^2)^(n+1/2) dx)/((n!*2^n)*sqrt(2)).
 * @author Georg Fischer
 */
public class A089155 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089155() {
    super(1, "[[0],[36,-42,12],[11,-8],[1]]", "[1,5,47]", 0);
  }
}
