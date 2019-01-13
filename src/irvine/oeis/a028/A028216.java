package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028216.
 * @author Sean A. Irvine
 */
public class A028216 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028216() {
    super(new long[] {-5940, 2784, -479, 36}, new long[] {1, 36, 817, 14952});
  }
}
