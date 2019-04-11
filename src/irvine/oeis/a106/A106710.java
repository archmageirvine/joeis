package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106710 Number of words with n letters from <code>an</code> alphabet of size 26 with at least two equal consecutive letters.
 * @author Sean A. Irvine
 */
public class A106710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106710() {
    super(new long[] {-650, 51}, new long[] {0, 26});
  }
}
