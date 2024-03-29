package irvine.oeis.a081;
// Generated by gen_seq4.pl holos [[0],[-5040,8028,-5104,1665,-295,27,-1],[7920,-12924,8468,-2865,530,-51,2],[-2520,4434,-3151,1158,-232,24,-1],[-576,768,-372,78,-6],[198,-291,156,-36,3],[30,-27,6],[-12,12,-3],[-2],[1]] [1,1,2,4,20,76,632,3424,38096,265360] 0 at 2020-03-14 22:45
// Recurrence: a[n+0]=2*a[n-1]+3*(n-2)^2*a[n-2]-3*(n-2)*(2*n-5)*a[n-3]-3*(n-3)*(n-2)*(n^2-7*n+11)*a[n-4]+6*(n-4)^2*(n-3)*(n-2)*a[n-5]+(n-7)*(n-5)*(n-4)*(n-3)^2*(n-2)*a[n-6]-(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*(2*n-11)*a[n-7]+(n-7)*(n-6)*(n-5)*(n-4)*(n-3)*(n-2)*a[n-8]
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A081440 Expansion of e.g.f.: exp(x)*cosh(x/sqrt(1 - x^2)).
 * @author Georg Fischer
 */
public class A081440 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A081440() {
    super(0, "[[0],[-5040,8028,-5104,1665,-295,27,-1],[7920,-12924,8468,-2865,530,-51,2],[-2520,4434,-3151,1158,-232,24,-1],[-576,768,-372,78,-6],[198,-291,156,-36,3],[30,-27,6],[-12,12,-3],[-2],[1]]", "[1,1,2,4,20,76,632,3424,38096,265360]", 0);
  }
}
