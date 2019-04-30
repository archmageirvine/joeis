package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104896 <code>a(0) = 0; a(n) = 7*a(n-1) + 7</code>.
 * @author Sean A. Irvine
 */
public class A104896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104896() {
    super(new long[] {-7, 8}, new long[] {0, 7});
  }
}
