package irvine.oeis.a135;

import irvine.oeis.gf.GfSequence;

/**
 * A135649 Seven-person pyramidal game with four payoff matrices: expansion of the 49by49 matrix characteristic polynomial: p(x)=(1 + x^6 - x^7)^3(1 + 2 x^6 - x^7)^2(1 + 3 x^6 - x^7)(23 + 49 x^6 -x^7) f(x)=1/(x^49*p(1/x)) Weights: 7-&gt;{1,1,2,3}.
 * @author Sean A. Irvine
 */
public class A135649 extends GfSequence {

  /** Construct the sequence. */
  public A135649() {
    super(0, "1/((x^7+x-1)^3*(x^7+2*x-1)^2*(x^7+3*x-1)*(23*x^7+49*x-1))");
  }
}
