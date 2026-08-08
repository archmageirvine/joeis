package irvine.oeis.a099;
// manually 2026-08-08.ack/count10 at 2026-08-08 20:16

import irvine.oeis.CountLess10nthSequence;
import irvine.oeis.a006.A006988;

/**
 * A099260 Number of decimal digits in (10^n)-th prime number.
 * @author Georg Fischer
 */
public class A099260 extends CountLess10nthSequence {

  /** Construct the sequence */
  public A099260() {
    super(0, new A006988());
    next();
  }
}
