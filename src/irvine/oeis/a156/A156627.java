package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156627 <code>a(n) = 4394*n - 1820</code>.
 * @author Sean A. Irvine
 */
public class A156627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156627() {
    super(new long[] {-1, 2}, new long[] {2574, 6968});
  }
}
