package irvine.oeis.a186;
// manually hologfm/hologf at 2022-11-07 08:59

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A186940 Diagonal sums of number triangle A114709.
 * @author Georg Fischer
 */
public class A186940 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A186940() {
    // o.g.f. (1+3*x-2*x^2-(x^2-6*x+1)^(1/2))/(2*x^3-6*x^2+2*x+6)
    // recurrence (-128*(n-2)^2+324*n-682)*u(n-2)+(n-7)*(n-6)*u(n-8)-18*(n-6)*(n-5)*u(n-7)+(108*(n-2)^2-576*n+1902)*u(n-6)+(-252*(n-2)^2+972*n-2844)*u(n-5)+(204*(n-2)^2-216*n+282)*u(n-4)+54*(n-3)*(n-16)*u(n-3)+72*(n-2)*(n-1)*u(n-1)-9*(n-1)*n*u(n) = 0
    super(0, "[[0],[42,-13,1],[-540,198,-18],[2334,-1008,108],[-3852,1980,-252],[1098,-1032,204],[2592,-1026,54],[-1194,836,-128],[144,-216,72],[0,9,-9]]", "[1,0,3,6,31,126,589,2772]", -1);
  }
}
