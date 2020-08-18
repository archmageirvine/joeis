package irvine.oeis.a036;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.math.z.Z;
import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A036025 Number of partitions of n into parts not of form <code>4k+2, 20k, 20k+3</code> or <code>20k-3</code>. Also number of partitions in which no odd part is repeated, with 1 part of size less than or equal to 2 and where differences between parts at distance 4 are greater than 1 when the smallest part is odd and greater than 2 when the smallest part is even.
 * @author Georg Fischer
 */
public class A036025 extends EulerTransform {

  /** Construct the sequence. */
  public A036025() {
    super(new PeriodicSequence(1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0), new Z[0]);
  }
}
