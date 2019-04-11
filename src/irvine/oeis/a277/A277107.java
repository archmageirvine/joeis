package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277107 <code>a(n) = 16*3^n - 48</code>.
 * @author Sean A. Irvine
 */
public class A277107 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277107() {
    super(new long[] {-3, 4}, new long[] {0, 96});
  }
}
