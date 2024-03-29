package irvine.oeis.a185;
// Generated by gen_seq4.pl binomx at 2023-09-24 23:25

import irvine.oeis.a218.A218667;
import irvine.oeis.transform.BinomialTransform;

/**
 * A185040 O.g.f.: 1/(1-x) * Sum_{n&gt;=0} 1/(1-(n+1)*x)^n * x^n/n! * exp(-x/(1-(n+1)*x)).
 * @author Georg Fischer
 */
public class A185040 extends BinomialTransform {

  /** Construct the sequence. */
  public A185040() {
    super(0, new A218667(), 0, false);
  }
}
