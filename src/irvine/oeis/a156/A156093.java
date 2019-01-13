package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156093.
 * @author Sean A. Irvine
 */
public class A156093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156093() {
    super(new long[] {-1, -48, -48}, new long[] {0, -1, 48});
  }
}
