package irvine.oeis.a360;
// Generated by gen_seq4.pl hologfm/hologf at 2023-05-08 16:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A360083 a(n) = Sum_{k=0..n} binomial(5*k,n-k) * Catalan(k).
 * @author Georg Fischer
 */
public class A360083 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A360083() {
    // o.g.f. 2/(1+(1-4*x*(1+x)^5)^(1/2))
    // recurrence -(n+1)*u(n)-(-3*n+7)*u(n-1)-(-24*n+26)*u(n-2)-(-60*n+100)*u(n-3)-(-80*n+180)*u(n-4)-(-60*n+170)*u(n-5)-(-24*n+82)*u(n-6)-(-4*n+16)*u(n-7) = 0
    super(0, "[[0],[-16,4],[-82,24],[-170,60],[-180,80],[-100,60],[-26,24],[-7,3],[-1,-1]]", "[1,1,7,35,189,1092,6538,40278]", 0);
  }
}
