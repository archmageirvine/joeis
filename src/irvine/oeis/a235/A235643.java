package irvine.oeis.a235;

import irvine.oeis.Conjectural;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A235643 Total number of sides of a tetraflake-like fractal after n iterations, a(1) = 16 (see comments).
 * @author Sean A. Irvine
 */
public class A235643 extends LinearRecurrence implements Conjectural {

  /** Construct the sequence. */
  public A235643() {
    super(1, new long[] {-7, 6}, new long[] {16, 68});
  }
}
