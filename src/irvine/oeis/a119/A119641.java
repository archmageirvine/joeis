package irvine.oeis.a119;

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000055;

/**
 * A119641 Prime numbers of trees with n unlabeled nodes.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A119641 extends FilterSequence {

  /** Construct the sequence. */
  public A119641() {
    super(1, new A000055(), PRIME);
  }
}
