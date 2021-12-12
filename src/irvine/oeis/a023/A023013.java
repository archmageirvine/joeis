package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010854;

/**
 * A023013 Number of partitions of n into parts of 15 kinds.
 * @author Sean A. Irvine
 */
public class A023013 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023013() {
    super(new A010854(), 0);
  }
}
