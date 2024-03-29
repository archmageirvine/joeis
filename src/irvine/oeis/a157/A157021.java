package irvine.oeis.a157;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-11 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A157021 a(n)=sum{k=0..floor(n/2), C(n,2k)*A000108(floor(k/2))}. Inverse binomial transform is aeration of doubled Catalan numbers.
 * @author Georg Fischer
 */
public class A157021 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A157021() {
    // o.g.f. 1/2*(2*x^2-2*x+1)*(1-x)*(1-(1-4*x^4/(1-x)^4)^(1/2))/x^4
    // recurrence -(n+4)*((n-5)^2-n+7)*u(n)-(-5*(n-5)^3-34*(n-5)^2+9*n-135)*u(n-1)-(10*(n-5)^3+56*(n-5)^2+34*n-22)*u(n-2)-(-10*(n-5)^3-44*(n-5)^2-54*n+186)*u(n-3)-(n-4)*((n-5)^2+7*n-33)*u(n-4)-3*(n-4)*((n-5)^2+n-3)*u(n-5) = 0
    super(0, "[[0],[264,-174,39,-3],[-32,-4,7,-1],[-336,364,-106,10],[-128,-224,94,-10],[360,26,-41,5],[-128,12,7,-1]]", "[1,1,2,4,8,16]", 0);
  }
}
