package irvine.oeis.a036;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A036021 Number of partitions of n into parts not of form <code>4k+2, 16k, 16k+3</code> or <code>16k-3</code>.
 * @author Georg Fischer
 */
public class A036021 extends EulerTransform {

  /** Construct the sequence. */
  public A036021() {
    super(new PeriodicSequence(1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0), 1);
  }
}
