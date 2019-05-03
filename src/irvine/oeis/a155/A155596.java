package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155596 <code>5^n-2^n+1^n</code>.
 * @author Sean A. Irvine
 */
public class A155596 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155596() {
    super(new long[] {10, -17, 8}, new long[] {1, 4, 22});
  }
}
