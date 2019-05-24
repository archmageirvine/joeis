package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010722;

/**
 * A023005 Number of partitions of n into parts of 6 kinds.
 * @author Sean A. Irvine
 */
public class A023005 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023005() {
    super(new A010722(), 0);
  }
}
