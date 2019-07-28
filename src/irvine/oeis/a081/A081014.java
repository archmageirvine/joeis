package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081014 <code>a(n) = Lucas(4*n+1) + 1</code>, or <code>Lucas(2*n)*Lucas(2*n+1)</code>.
 * @author Sean A. Irvine
 */
public class A081014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081014() {
    super(new long[] {1, -8, 8}, new long[] {2, 12, 77});
  }
}
