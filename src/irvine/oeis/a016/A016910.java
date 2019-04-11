package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016910 <code>a(n) = (6n)^2</code>.
 * @author Sean A. Irvine
 */
public class A016910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016910() {
    super(new long[] {1, -3, 3}, new long[] {0, 36, 144});
  }
}
