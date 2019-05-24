package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010716;

/**
 * A023004 Number of partitions of n into parts of 5 kinds.
 * @author Sean A. Irvine
 */
public class A023004 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023004() {
    super(new A010716(), 0);
  }
}
