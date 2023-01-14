package irvine.oeis.a034;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A034824 Number of n-node rooted trees of height at most 7.
 * @author Sean A. Irvine
 */
public class A034824 extends EulerTransform {

  /** Construct the sequence. */
  public A034824() {
    super(0, new SkipSequence(new A034823(), 1), 1, 1);
  }
}
