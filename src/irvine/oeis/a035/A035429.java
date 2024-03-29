package irvine.oeis.a035;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A035429 Number of partitions of n into parts 7k+1 or 7k+5.
 * @author Georg Fischer
 */
public class A035429 extends EulerTransform {

  /** Construct the sequence. */
  public A035429() {
    super(1, new PeriodicSequence(1, 0, 0, 0, 1, 0, 0), new Z[0]);
  }
}
