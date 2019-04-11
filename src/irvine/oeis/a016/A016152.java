package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016152 <code>a(n) = 4^(n-1)*(2^n-1)</code>.
 * @author Sean A. Irvine
 */
public class A016152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016152() {
    super(new long[] {-32, 12}, new long[] {1, 12}, 0);
  }
}
