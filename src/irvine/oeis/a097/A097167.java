package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097167 <code>3*10^n-2*9^n</code>.
 * @author Sean A. Irvine
 */
public class A097167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097167() {
    super(new long[] {-90, 19}, new long[] {1, 12});
  }
}
