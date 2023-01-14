package irvine.oeis.a002;

import irvine.oeis.recur.PaddingSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A002799 Number of 4-line partitions of n (i.e., planar partitions of n with at most 4 lines).
 * @author Sean A. Irvine
 */
public class A002799 extends EulerTransform {

  /** Construct the sequence. */
  public A002799() {
    super(0, new PaddingSequence(new long[] {1, 2, 3}, new long[] {4}), 1);
  }
}
