package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010734;

/**
 * A023008 Number of partitions of n into parts of 9 kinds.
 * @author Sean A. Irvine
 */
public class A023008 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023008() {
    super(new A010734(), 0);
  }
}
