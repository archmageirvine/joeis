package irvine.oeis.a087;
// manually 2026-08-02

import irvine.oeis.PrependSequence;
import irvine.oeis.a352.A352479;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A087916 Number of ordered ways to write 2n+1 as a sum of 3 odd primes.
 * @author Georg Fischer
 */
public class A087916 extends PrependSequence {

  /** Construct the sequence. */
  public A087916() {
    super(new ConvolutionProduct(0, "-3", new A352479()), 0, 0, 0, 0);
  }
}
