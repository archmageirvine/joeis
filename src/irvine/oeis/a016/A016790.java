package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016790 <code>a(n) = (3n+2)^2</code>.
 * @author Sean A. Irvine
 */
public class A016790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016790() {
    super(new long[] {1, -3, 3}, new long[] {1, 4, 25});
  }
}
