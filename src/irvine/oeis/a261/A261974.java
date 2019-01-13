package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261974.
 * @author Sean A. Irvine
 */
public class A261974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261974() {
    super(new long[] {1, -47, 47}, new long[] {67, 3307, 152275});
  }
}
