package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132079 <code>a(n) = (5^n + 3)/2</code>.
 * @author Sean A. Irvine
 */
public class A132079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132079() {
    super(new long[] {-5, 6}, new long[] {2, 4});
  }
}
