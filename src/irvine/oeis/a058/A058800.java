package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.a006.A006966;
import irvine.oeis.transform.InverseInvertTransform;

/**
 * A058800 Vertically indecomposable lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058800 extends PrependSequence {

  /** Construct the sequence. */
  public A058800() {
    super(new InverseInvertTransform(0, new A006966(), 2), 1, 1);
  }
}
