package irvine.oeis.a035;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A035364 Number of partitions of n into parts 4k or 4k+3.
 * @author Georg Fischer
 */
public class A035364 extends EulerTransform {

  /** Construct the sequence. */
  public A035364() {
    super(1, new PeriodicSequence(0, 0, 1, 1), new Z[0]);
  }
}
