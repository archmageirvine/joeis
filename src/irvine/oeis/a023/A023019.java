package irvine.oeis.a023;

import irvine.oeis.transform.EulerTransformSequence;
import irvine.oeis.a010.A010860;

/**
 * A023019 Number of partitions of n into parts of 21 kinds.
 * @author Sean A. Irvine
 */
public class A023019 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A023019() {
    super(new A010860(), 0);
  }
}
