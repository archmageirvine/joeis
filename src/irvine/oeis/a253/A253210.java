package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253210 <code>a(n) = 7^n + 6</code>.
 * @author Sean A. Irvine
 */
public class A253210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253210() {
    super(new long[] {-7, 8}, new long[] {7, 13});
  }
}
