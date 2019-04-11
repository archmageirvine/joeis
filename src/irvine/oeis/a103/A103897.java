package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103897 <code>3*2^(n-1)*(2^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A103897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103897() {
    super(new long[] {-8, 6}, new long[] {3, 18});
  }
}
