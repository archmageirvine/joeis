package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006966;
import irvine.oeis.a051.A051573;

/**
 * A058800 Vertically indecomposable lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058800 extends PrependSequence {

  /** Construct the sequence. */
  public A058800() {
    super(new A051573(new A006966()), 1, 1);
  }
}
