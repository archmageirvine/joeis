package irvine.oeis.a287;
// manually etaprod at 2023-01-25

import irvine.oeis.transform.EtaProductSequence;

/**
 * A287619 Number of positive odd solutions to equation x^2 + 39y^2 = 8*(n + 5).
 * Eta product <code>q^(-5) * (eta(q^2) * eta(q^78))^2 / (eta(q) * eta(q^39))</code>
 * @author Georg Fischer
 */
public class A287619 extends EtaProductSequence {

  /** Construct the sequence. */
  public A287619() {
    super(0, "[78,2;2,2;39,-1;1,-1]", "-5");
  }
}
