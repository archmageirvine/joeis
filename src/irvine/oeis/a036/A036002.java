package irvine.oeis.a036;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A036002 Number of partitions in parts not of the form 25k, 25k+3 or 25k-3. Also number of partitions with at most 2 parts of size 1 and differences between parts at distance 11 are greater than 1.
 * @author Georg Fischer
 */
public class A036002 extends EulerTransform {

  /** Construct the sequence. */
  public A036002() {
    super(1, new PeriodicSequence(1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0), new Z[0]);
  }
}
