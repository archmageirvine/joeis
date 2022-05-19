package irvine.oeis.a057;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000010;

/**
 * A057000 a(n) = phi(n+1) - phi(n).
 * @author Sean A. Irvine
 */
public class A057000 extends DifferenceSequence {

  /** Construct the sequence. */
  public A057000() {
    super(new A000010());
  }
}
