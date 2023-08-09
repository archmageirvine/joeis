package irvine.oeis.a130;
// manually triprom/triprod at 2023-08-09

import irvine.oeis.a129.A129689;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A130197 Binomial transform of A130196.
 * @author Georg Fischer
 */
public class A130197 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A130197() {
    super(1, new A129689());
  }
}
