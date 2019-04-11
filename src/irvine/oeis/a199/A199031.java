package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199031 <code>2*12^n-1</code>.
 * @author Sean A. Irvine
 */
public class A199031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199031() {
    super(new long[] {-12, 13}, new long[] {1, 23});
  }
}
