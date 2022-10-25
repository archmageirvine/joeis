package irvine.oeis.a329;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A329521 The sixth moments of the alternated squared binomial coefficients; a(n) = Sum_{m=0..n} (-1)^m*m^6*binomial(n, m)^2.
 * @author Georg Fischer
 */
public class A329521 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A329521() {
    // gf = x*(-1+60*x-188*x^2-3720*x^3+15752*x^4+8400*x^5-90928*x^6+79680*x^7+42112*x^8-69120*x^9+17408*x^10)/(1+4*x^2)^(13/2)
    super(0, "[[0],[-696320,69632],[2211840,-276480],[-1376256,185856],[38400,249600],[11520,-321600],[-1195200,113280],[1308080,-27920],[-151920,-6480],[-146280,15000],[27960,-3480],[900,-192],[-180,60],[1,-1]]",
      "0,-1", 0);
  }
}
