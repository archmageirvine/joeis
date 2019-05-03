package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137717 Hankel transform of <code>A106191</code>.
 * @author Sean A. Irvine
 */
public class A137717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137717() {
    super(new long[] {-4, -2}, new long[] {1, -4});
  }
}
