package irvine.oeis.a080;

import irvine.oeis.FilterPositionSequence;

/**
 * A080064 Numbers n such that n == 1 modulo (spf(n)+1), where spf(m) is the smallest prime dividing m (A020639).
 * @author Sean A. Irvine
 */
public class A080064 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080064() {
    super(1, new A080063(), ONE);
  }
}
