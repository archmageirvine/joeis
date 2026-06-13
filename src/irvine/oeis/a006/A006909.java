package irvine.oeis.a006;

import irvine.oeis.gf.GfSequence;

/**
 * A006909 Theta series of laminated lattice LAMBDA_10.
 * @author Sean A. Irvine
 */
public class A006909 extends GfSequence {
  
  /** Construct the sequence. */
  public A006909() {
    super(0, "(eta(x)^8*eta(x^2)^5/eta(x^6)^3 + eta(x)^2*eta(x^2)^6*eta(x^3)^2*eta(x^4)*eta(x^6)^2/eta(x^12)^3 + 90*x*eta(x)^4*eta(x^2)*eta(x^3)^4*eta(x^6) - 80*x*eta(x)*eta(x^2)*eta(x^3)^5*eta(x^4)^3*eta(x^6)/eta(x^12) + 584*x^2*eta(x)^2*eta(x^2)*eta(x^3)^2*eta(x^4)^2*eta(x^6)*eta(x^12)^2 - 256*x^2*eta(x^2)*eta(x^3)^3*eta(x^4)^5*eta(x^6)*eta(x^12)/eta(x) - 32*x^2*eta(x)*eta(x^2)^6*eta(x^4)^2*eta(x^6)^2*eta(x^12)^2/eta(x^3)^3 - 81*x^2*eta(x)^2*eta(x^2)^2*eta(x^3)^2*eta(x^6)^6*eta(x^12)/eta(x^4)^3 + 729*x^2*eta(x^3)^8*eta(x^6)^5/eta(x^2)^3 - 128*x^3*eta(x^2)*eta(x^4)^4*eta(x^6)*eta(x^12)^4 + 2592*x^3*eta(x^2)^2*eta(x^3)*eta(x^4)^2*eta(x^6)^6*eta(x^12)^2/eta(x)^3)/2");
  }
}
