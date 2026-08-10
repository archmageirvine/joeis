package irvine.oeis.a119;
// manually 2026-08-09/parmof2 at 2026-08-09 23:36

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;
import irvine.oeis.a067.A067276;

/**
 * A119493 Determinant of n X n matrix of first n^2 terms of Kolakoski sequence (A000002).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A119493 extends A067276 {

  /** Construct the sequence. */
  public A119493() {
    super(0, new A000002());
  }

  @Override
  public Z next() {
    return super.next();
  }
}
