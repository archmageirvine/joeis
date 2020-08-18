package irvine.oeis.a035;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A035988 Number of partitions of n into parts not of the form <code>21k, 21k+10</code> or <code>21k-10</code>. Also number of partitions with at most 9 parts of size 1 and differences between parts at distance 9 are greater than 1.
 * @author Georg Fischer
 */
public class A035988 extends EulerTransform {

  /** Construct the sequence. */
  public A035988() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0), 1);
  }
}
