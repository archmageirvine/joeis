package irvine.oeis.a089;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-09 23:22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A089667 a(n) = S2(n,4), where S2(n, t) = Sum_{k=0..n} k^t *(Sum_{j=0..k} binomial(n,j))^2.
 * @author Georg Fischer
 */
public class A089667 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A089667() {
    // o.g.f. x*(384*x^3+640*x^2+172*x+4-x*(144*x^5-224*x^4+96*x^3-72*x^2+62*x+3)*(1-4*x)^(1/2))/(1-4*x)^6
    // recurrence -(n-2)*(n-1)*(93*(n-2)^9+147*(n-2)^8-3066*(n-2)^7-3054*(n-2)^6+8899*(n-2)^5+8131*(n-2)^4-7858*(n-2)^3-2852*(n-2)^2+1384*n-3152)*u(n)+2*(n-2)*(372*(n-2)^10+2541*(n-2)^9-6681*(n-2)^8-61662*(n-2)^7-69698*(n-2)^6+151895*(n-2)^5+258551*(n-2)^4-91348*(n-2)^3-170364*(n-2)^2+60014*n-132208)*u(n-1)-8*n*(2*n-7)*(93*(n-2)^9+984*(n-2)^8+1458*(n-2)^7-12588*(n-2)^6-53861*(n-2)^5-78486*(n-2)^4-38690*(n-2)^3+8618*(n-2)^2+11352*n-21264)*u(n-2) = 0
    super(0, "[[0],[0, 142016,-488128, 120144, 111856, 1296320,-2265240, 1362704,-285456,-24336, 16248,-1488],[20160,-297560, 1164332,-2333704, 4532788,-5508938, 3498534,-1040740, 49872, 48678,-11286, 744],[-161280, 948384,-2519920, 3840052,-3584048, 2041587,-642816, 55931, 33138,-12741, 1806,-93]]", "[0, 4, 265, 5984]", 0);
  }
}
