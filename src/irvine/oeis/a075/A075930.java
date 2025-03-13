package irvine.oeis.a075;

import irvine.oeis.FilterSequence;
import irvine.oeis.a057.A057716;

/**
 * A075930 Positions of check bits in code in A075928.
 * @author Sean A. Irvine
 */
public class A075930 extends FilterSequence {

  /** Construct the sequence. */
  public A075930() {
    super(0, new A057716().skip(), t -> (t.bitCount() & 1) == 1);
  }
}
