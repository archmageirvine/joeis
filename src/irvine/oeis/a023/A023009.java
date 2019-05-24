package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010692;

/**
 * A023009 Number of partitions of n into parts of 10 kinds.
 * @author Sean A. Irvine
 */
public class A023009 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023009() {
    super(new A010692(), 0);
  }
}
