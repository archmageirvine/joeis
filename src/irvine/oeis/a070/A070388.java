package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070388 <code>a(n) = 5^n mod 42</code>.
 * @author Sean A. Irvine
 */
public class A070388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070388() {
    super(new long[] {1, -2, 2}, new long[] {1, 5, 25});
  }
}
