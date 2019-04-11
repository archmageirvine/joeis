package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087863 <code>(n^3+24*n^2+65*n+36)/6</code>.
 * @author Sean A. Irvine
 */
public class A087863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087863() {
    super(new long[] {-1, 4, -6, 4}, new long[] {6, 21, 45, 79});
  }
}
