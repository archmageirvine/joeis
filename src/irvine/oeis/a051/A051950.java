package irvine.oeis.a051;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000005;

/**
 * A051950 Differences between values of tau(n) (A000005): a(n) = tau(n)-tau(n-1).
 * @author Sean A. Irvine
 */
public class A051950 extends DifferenceSequence {

  /** Construct the sequence. */
  public A051950() {
    super(new A000005());
  }
}
