package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010731;

/**
 * A023007 Number of partitions of n into parts of 8 kinds.
 * @author Sean A. Irvine
 */
public class A023007 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023007() {
    super(new A010731(), 0);
  }
}
