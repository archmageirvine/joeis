package irvine.oeis.a182;
// Generated by gen_seq4.pl eulerper at 2020-03-06 22:01

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A182805 Number of 10-core partitions of n.
 * @author Georg Fischer
 */
public class A182805 extends EulerTransform {

  /** Construct the sequence. */
  public A182805() {
    super(0, new PeriodicSequence(1, 1, 1, 1, 1, 1, 1, 1, 1, -9), 1);
  }
}
