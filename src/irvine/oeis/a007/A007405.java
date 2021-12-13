package irvine.oeis.a007;

import irvine.oeis.transform.BinomialTransformSequence;
import irvine.oeis.a004.A004211;

/**
 * A007405 Dowling numbers: e.g.f.: exp(x + (exp(b*x) - 1)/b) with b=2.
 * @author Sean A. Irvine
 */
public class A007405 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A007405() {
    super(new A004211(), 0);
  }
}

