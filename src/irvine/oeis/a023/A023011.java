package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010852;

/**
 * A023011 Number of partitions of n into parts of 13 kinds.
 * @author Sean A. Irvine
 */
public class A023011 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023011() {
    super(new A010852(), 0);
  }
}
