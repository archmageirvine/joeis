package irvine.oeis.a239;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A239198 Expansion of -(3*x^5+sqrt(-7*x^2-6*x+1)*(3*x^4+5*x^3-11*x^2-7*x+2)-24*x^4-34*x^3+10*x^2+15*x-2) / (7*x^5+sqrt(-7*x^2-6*x+1)*(3*x^4+6*x^3-2*x^2+6*x-5)-15*x^4-12*x^3-12*x^2-19*x+3).
 * @author Georg Fischer
 */
public class A239198 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A239198() {
    // o.g.f. -(3*x^5+(-7*x^2-6*x+1)^(1/2)*(3*x^4+5*x^3-11*x^2-7*x+2)-24*x^4-34*x^3+10*x^2+15*x-2)/(7*x^5+(-7*x^2-6*x+1)^(1/2)*(3*x^4+6*x^3-2*x^2+6*x-5)-15*x^4-12*x^3-12*x^2-19*x+3)
    // recurrence -(16*(n-2)^2-6*n+20)*u(n-2)-357*(n-8)*(n-7)*u(n-8)-6*(121*n-673)*(n-7)*u(n-7)-(680*(n-2)^2-5818*n+24980)*u(n-6)-(706*(n-2)^2-5952*n+24494)*u(n-5)-(338*(n-2)^2-1900*n+6440)*u(n-4)-(-30*(n-2)^2+248*n-842)*u(n-3)+2*(n-1)*(5*n-7)*u(n-1)-(n-1)*n*u(n) = 0
    super(1, "[[0],[-19992, 5355,-357],[-28266, 9120,-726],[-27700, 8538,-680],[-27318, 8776,-706],[-7792, 3252,-338],[962,-368, 30],[-84, 70,-16],[14,-24, 10],[0, 1,-1]]", "[1, 3, 13, 67, 377, 2235, 13701, 85947, 548209]", 0);
  }
}
