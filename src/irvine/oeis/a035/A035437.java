package irvine.oeis.a035;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.math.z.Z;
import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A035437 Number of partitions of n into parts 7k+3 or 7k+6.
 * @author Georg Fischer
 */
public class A035437 extends EulerTransform {

  /** Construct the sequence. */
  public A035437() {
    super(1, new PeriodicSequence(0, 0, 1, 0, 0, 1, 0), new Z[0]);
  }
}
