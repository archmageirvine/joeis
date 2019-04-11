package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198080 <code>a(n) = (3^(3*n + 3)- 26*n - 27)/169</code>.
 * @author Sean A. Irvine
 */
public class A198080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198080() {
    super(new long[] {27, -55, 29}, new long[] {0, 4, 116});
  }
}
