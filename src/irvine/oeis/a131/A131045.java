package irvine.oeis.a131;

import irvine.oeis.a000.A000010;
import irvine.oeis.transform.BinomialTransform;

/**
 * A131045 Binomial transform of Euler's totient function phi(n+1).
 * @author Georg Fischer
 */
public class A131045 extends BinomialTransform {

  /** Construct the sequence. */
  public A131045() {
    super(new A000010());
  }
}
