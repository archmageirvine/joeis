package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158221 <code>a(n) = 169n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158221() {
    super(new long[] {-1, 2}, new long[] {170, 339});
  }
}
