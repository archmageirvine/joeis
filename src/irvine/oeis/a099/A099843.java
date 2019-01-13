package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099843.
 * @author Sean A. Irvine
 */
public class A099843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099843() {
    super(new long[] {1, -4}, new long[] {1, -5});
  }
}
