package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081271 Vertical of triangular spiral in <code>A051682</code>.
 * @author Sean A. Irvine
 */
public class A081271 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081271() {
    super(new long[] {1, -3, 3}, new long[] {1, 13, 34});
  }
}
