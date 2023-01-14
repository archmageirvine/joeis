package irvine.oeis.a034;

import irvine.oeis.SkipSequence;
import irvine.oeis.a001.A001385;
import irvine.oeis.transform.EulerTransform;

/**
 * A034823 Number of n-node rooted trees of height at most 6.
 * @author Sean A. Irvine
 */
public class A034823 extends EulerTransform {

  /** Construct the sequence. */
  public A034823() {
    super(0, new SkipSequence(new A001385(), 1), 1, 1);
  }
}
