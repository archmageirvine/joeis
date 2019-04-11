package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169721 <code>a(n) = (2*(3*2^(n-1)-1))^2</code>.
 * @author Sean A. Irvine
 */
public class A169721 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169721() {
    super(new long[] {8, -14, 7}, new long[] {1, 16, 100});
  }
}
