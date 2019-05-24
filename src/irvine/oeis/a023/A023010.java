package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010850;

/**
 * A023010 Number of partitions of n into parts of 11 kinds.
 * @author Sean A. Irvine
 */
public class A023010 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023010() {
    super(new A010850(), 0);
  }
}
