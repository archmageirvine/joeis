package irvine.oeis.a035;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A035975 Number of partitions of n into parts not of the form 19k, 19k+6 or 19k-6. Also number of partitions with at most 5 parts of size 1 and differences between parts at distance 8 are greater than 1.
 * @author Georg Fischer
 */
public class A035975 extends EulerTransform {

  /** Construct the sequence. */
  public A035975() {
    super(1, new PeriodicSequence(1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0), new Z[0]);
  }
}
