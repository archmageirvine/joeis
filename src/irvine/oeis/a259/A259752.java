package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259752 <code>a(n) = 24n + 6</code>.
 * @author Sean A. Irvine
 */
public class A259752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259752() {
    super(new long[] {-1, 2}, new long[] {6, 30});
  }
}
