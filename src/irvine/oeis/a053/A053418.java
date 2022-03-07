package irvine.oeis.a053;

import irvine.oeis.transform.EulerTransformSequence;

/**
 * A053418 Number of unlabeled directed graphs with n arcs and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A053418 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A053418() {
    super(new A053454(), 1);
  }
}
