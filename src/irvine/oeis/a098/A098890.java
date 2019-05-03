package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098890 <code>a(n) = A001652(n)*A046090(n)+1 = A098602(n)+1</code>.
 * @author Sean A. Irvine
 */
public class A098890 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098890() {
    super(new long[] {1, -35, 35}, new long[] {1, 13, 421});
  }
}
