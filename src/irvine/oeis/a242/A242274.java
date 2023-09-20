package irvine.oeis.a242;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a060.A060352;

/**
 * A242274 Numbers k such that k*3^k - 1 is semiprime.
 * @author Sean A. Irvine
 */
public class A242274 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A242274() {
    super(1, 1, new A060352(), SEMIPRIME);
  }
}
