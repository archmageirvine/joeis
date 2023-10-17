package irvine.oeis.a366;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a178.A178248;

/**
 * A366582 Numbers k such that 6^k + 1 is a semiprime.
 * @author Sean A. Irvine
 */
public class A366702 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A366702() {
    super(1, 0, new A178248(), SEMIPRIME);
  }
}
