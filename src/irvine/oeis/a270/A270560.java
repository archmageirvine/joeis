package irvine.oeis.a270;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-11 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A270560 a(n) = Sum_{i=0..n/2}((binomial(2*i+1,i)*binomial(2*n+2,n-2*i))/(2*i+1)).
 * @author Georg Fischer
 */
public class A270560 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A270560() {
    // o.g.f. 1/2/x*(1-(((1-(1-4*x)^(1/2))/x-1)*(3-(1-(1-4*x)^(1/2))/x))^(1/2))/(1-4*x)^(1/2)/(1/2*(1-(1-4*x)^(1/2))/x-1)
    // recurrence -4*(n+2)*(n+1)*n*(n-2)*(5*(n-4)^2+45*n-96)*u(n)+8*(n+1)*n*(30*(n-4)^4+465*(n-4)^3+2494*(n-4)^2+5553*n-17838)*u(n-1)-n*(915*(n-4)^5+17385*(n-4)^4+124822*(n-4)^3+428540*(n-4)^2+708120*n-2380320)*u(n-2)+2*(2*n-3)*(n-1)*(230*(n-4)^4+3680*(n-4)^3+20119*(n-4)^2+45751*n-146014)*u(n-3)+36*(2*n-3)*(2*n-5)*(n-1)*(n-2)*(5*(n-4)^2+55*n-86)*u(n-4) = 0
    super(0, "[[0],[-6480,32832,-51516,30528,-3204,-2880,720],[-4500,22854,-40356,29846,-6464,-2300,920],[0,-1312,8104,-14036,6938,915,-915],[0,-112,1816,280,-1768,120,240],[0,-256,-176,224,124,-40,-20]]", "[1,4,16,64,257]", 0);
  }
}
