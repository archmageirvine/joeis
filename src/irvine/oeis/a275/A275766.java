package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275766 <code>a(n) = (5^(2*(n + 1)) - 1)/4</code>.
 * @author Sean A. Irvine
 */
public class A275766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275766() {
    super(new long[] {-25, 26}, new long[] {156, 3906});
  }
}
