package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010862;

/**
 * A023021 Number of partitions of n into parts of 23 kinds.
 * @author Sean A. Irvine
 */
public class A023021 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023021() {
    super(new A010862(), 0);
  }
}
