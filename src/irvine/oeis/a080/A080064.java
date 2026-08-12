package irvine.oeis.a080;

import irvine.oeis.FilterPositionSequence;

/**
 * A080064 Numbers k such that k == 1 modulo (lpf(k)+1), where lpf(k) is the least prime dividing k (A020639).
 * @author Sean A. Irvine
 */
public class A080064 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080064() {
    super(1, new A080063(), ONE);
  }
}
