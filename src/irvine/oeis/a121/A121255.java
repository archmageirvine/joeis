package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121255 Number of conjugated cycles composed of ten carbons in <code>(n,n)-nanotubes</code> in terms of the number of naphthalene units.
 * @author Sean A. Irvine
 */
public class A121255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121255() {
    super(new long[] {-1, 6, -11, 6}, new long[] {0, 8, 36, 128});
  }
}
