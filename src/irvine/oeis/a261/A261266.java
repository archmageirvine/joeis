package irvine.oeis.a261;
// Generated by gen_seq4.pl holos [[0],[-48,16],[96,-40],[-56,34],[8,-11],[0,1]] [1,2,8,44,264] 0 at 2020-02-15 22:07
// Recurrence: n*a[n+0]+(-11*n+8)*a[n-1]+2*(17*n-28)*a[n-2]+8*(-5*n+12)*a[n-3]+16*(n-3)*a[n-4]=0
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A261266 Expansion of ((x-1/2)*(1/sqrt(8*x^2-8*x+1)+1)-x)/(x-1).
 * @author Georg Fischer
 */
public class A261266 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A261266() {
    super(0, "[[0],[-48,16],[96,-40],[-56,34],[8,-11],[0,1]]", "[1,2,8,44,264]", 0);
  }
}
