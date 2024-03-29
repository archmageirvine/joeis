package irvine.oeis.a036;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A036032 Number of partitions of n into parts not of form 4k+2, 24k, 24k+7 or 24k-7. Also number of partitions in which no odd part is repeated, with at most 3 parts of size less than or equal to 2 and where differences between parts at distance 5 are greater than 1 when the smallest part is odd and greater than 2 when the smallest part is even.
 * @author Georg Fischer
 */
public class A036032 extends EulerTransform {

  /** Construct the sequence. */
  public A036032() {
    super(1, new PeriodicSequence(1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0), new Z[0]);
  }
}
