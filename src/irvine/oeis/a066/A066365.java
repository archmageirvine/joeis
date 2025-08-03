package irvine.oeis.a066;

import irvine.math.function.Functions;

/**
 * A066365 f-perfect numbers, where f(m) = sigma(m)-m.
 * @author Sean A. Irvine
 */
public class A066365 extends A066367 {

  /** Construct the sequence. */
  public A066365() {
    super(k -> Functions.SIGMA1.z(k).subtract(k).abs().longValueExact());
  }
}
