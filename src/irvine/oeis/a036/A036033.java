package irvine.oeis.a036;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A036033 Number of partitions of n into parts not of form <code>4k+2, 24k, 24k+9</code> or <code>24k-9</code>. Also number of partitions in which no odd part is repeated, with at most 4 parts of size less than or equal to 2 and where differences between parts at distance 5 are greater than 1 when the smallest part is odd and greater than 2 when the smallest part is even.
 * @author Georg Fischer
 */
public class A036033 extends EulerTransform {

  /** Construct the sequence. */
  public A036033() {
    super(new PeriodicSequence(1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0), 1);
  }
}
