package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010857;

/**
 * A023016 Number of partitions of n into parts of 18 kinds.
 * @author Sean A. Irvine
 */
public class A023016 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023016() {
    super(new A010857(), 0);
  }
}
