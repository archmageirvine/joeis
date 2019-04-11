package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081657 <code>2*7^n-3^n</code>.
 * @author Sean A. Irvine
 */
public class A081657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081657() {
    super(new long[] {-21, 10}, new long[] {1, 11});
  }
}
