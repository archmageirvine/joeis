package irvine.oeis.a007;

import irvine.oeis.BinomialTransformSequence;
import irvine.oeis.a004.A004211;

/**
 * A007405 Dowling numbers: e.g.f.: exp(x + (exp(b*x) <code>- 1)/b)</code> with <code>b=2</code>.
 * @author Sean A. Irvine
 */
public class A007405 extends BinomialTransformSequence {

  /** Construct the sequence. */
  public A007405() {
    super(new A004211(), 0);
  }
}

