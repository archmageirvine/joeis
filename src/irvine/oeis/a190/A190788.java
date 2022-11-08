package irvine.oeis.a190;
// manually hologfm/hologf at 2022-11-07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A190788 Expansion of ((x-1)*sqrt(1-4*x^2))/((x-1)*sqrt(1-4*x^2)+x).
 * @author Georg Fischer
 */
public class A190788 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A190788() {
    // o.g.f. (x-1)*(-4*x^2+1)^(1/2)/((x-1)*(-4*x^2+1)^(1/2)+x)
    // recurrence -(n-6)*(n-1)*u(n)-(-2*(n-6)^2-10*n+56)*u(n-1)-(-8*(n-6)^2-28*n+172)*u(n-2)-8*(n-3)*(2*n-11)*u(n-3)-(12*(n-6)^2+12*n-88)*u(n-4)-(-32*(n-6)^2-64*n+368)*u(n-5)-16*(n-5)^2*u(n-6) = 0
    super(0, "[[0],[-400,160,-16],[784,-320,32],[-344,132,-12],[-264,136,-16],[116,-68,8],[16,-14,2],[-6,7,-1]]", "[1,1,2,6,14,38,94]", 0);
  }
}
