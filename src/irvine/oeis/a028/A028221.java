package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028221.
 * @author Sean A. Irvine
 */
public class A028221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028221() {
    super(new long[] {-6048, 2796, -479, 36}, new long[] {1, 36, 817, 14964});
  }
}
