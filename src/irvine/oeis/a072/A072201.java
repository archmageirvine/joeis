package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072201 <code>a(n) = 4*a(n-1) + 1, a(1) = 15</code>.
 * @author Sean A. Irvine
 */
public class A072201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072201() {
    super(new long[] {-4, 5}, new long[] {15, 61});
  }
}
