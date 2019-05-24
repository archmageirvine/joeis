package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010709;

/**
 * A023003 Number of partitions of n into parts of 4 kinds.
 * @author Sean A. Irvine
 */
public class A023003 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023003() {
    super(new A010709(), 0);
  }
}
