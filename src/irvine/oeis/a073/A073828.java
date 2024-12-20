package irvine.oeis.a073;

import irvine.oeis.FilterSequence;
import irvine.oeis.a019.A019515;

/**
 * A073828.
 * @author Sean A. Irvine
 */
public class A073828 extends FilterSequence {

  /** Construct the sequence. */
  public A073828() {
    super(1, new A019515(), PRIME);
  }
}
