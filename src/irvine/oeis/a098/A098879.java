package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098879 <code>a(n) = (2^n - 1)^5 - 2</code>.
 * @author Sean A. Irvine
 */
public class A098879 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098879() {
    super(new long[] {-32768, 64512, -41664, 11160, -1302, 63}, new long[] {-2, -1, 241, 16805, 759373, 28629149});
  }
}
