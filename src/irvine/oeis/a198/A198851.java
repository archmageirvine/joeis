package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198851 <code>3*8^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198851() {
    super(new long[] {-8, 9}, new long[] {2, 23});
  }
}
