package irvine.oeis.a023;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a010.A010727;

/**
 * A023006 Number of partitions of n into parts of 7 kinds.
 * @author Sean A. Irvine
 */
public class A023006 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023006() {
    super(new A010727(), 0);
  }
}
