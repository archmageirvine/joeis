package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010856;

/**
 * A023015 Number of partitions of n into parts of 17 kinds.
 * @author Sean A. Irvine
 */
public class A023015 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023015() {
    super(new A010856(), 0);
  }
}
