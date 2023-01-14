package irvine.oeis.a034;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A034826 Number of n-node rooted trees of height at most 9.
 * @author Sean A. Irvine
 */
public class A034826 extends EulerTransform {

  /** Construct the sequence. */
  public A034826() {
    super(0, new SkipSequence(new A034825(), 1), 1, 1);
  }
}

