package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010858;

/**
 * A023017 Number of partitions of n into parts of 19 kinds.
 * @author Sean A. Irvine
 */
public class A023017 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023017() {
    super(new A010858(), 0);
  }
}
