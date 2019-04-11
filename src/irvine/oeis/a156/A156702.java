package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156702 Numbers n such that <code>n^2-1 == 0 mod 24^2</code>.
 * @author Sean A. Irvine
 */
public class A156702 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156702() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 127, 161, 287, 289});
  }
}
