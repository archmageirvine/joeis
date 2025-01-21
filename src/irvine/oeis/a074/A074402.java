package irvine.oeis.a074;

import irvine.oeis.a000.A000926;
import irvine.oeis.closure.MultiplicativeClosureSequence;

/**
 * A074402 Multiplicative closure of Euler's "numeri idonei" (A000926).
 * @author Sean A. Irvine
 */
public class A074402 extends MultiplicativeClosureSequence {

  /** Construct the sequence. */
  public A074402() {
    super(1, new A000926().skip());
  }
}
