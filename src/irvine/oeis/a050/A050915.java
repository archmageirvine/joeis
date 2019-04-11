package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050915 <code>a(n) = n*4^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A050915 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050915() {
    super(new long[] {16, -24, 9}, new long[] {1, 5, 33});
  }
}
