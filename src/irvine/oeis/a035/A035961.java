package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035961 Number of partitions of n into parts not of the form <code>15k, 15k+7</code> or <code>15k-7</code>. Also number of partitions with at most 6 parts of size 1 and differences between parts at distance 6 are greater than 1.
 * @author Georg Fischer
 */
public class A035961 extends EulerTransform {

  /** Construct the sequence. */
  public A035961() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0), 1);
  }
}
