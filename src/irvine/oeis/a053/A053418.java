package irvine.oeis.a053;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A053418 Number of unlabeled directed graphs with n arcs and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A053418 extends EulerTransform {

  /** Construct the sequence. */
  public A053418() {
    super(0, new SkipSequence(new A053454(), 1), 1);
  }
}
