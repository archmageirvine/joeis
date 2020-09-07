package irvine.oeis.a034;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PrependSequence;

/**
 * A034826 Number of n-node rooted trees of height at most 9.
 * @author Sean A. Irvine
 */
public class A034826 extends PrependSequence {

  /** Construct the sequence. */
  public A034826() {
    super(new EulerTransformSequence(new A034825(), 1), 1);
  }
}

