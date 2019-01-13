package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177142.
 * @author Sean A. Irvine
 */
public class A177142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177142() {
    super(new long[] {22, -31, -69, 30, 5}, new long[] {1, 11, 82, 663, 4985});
  }
}
