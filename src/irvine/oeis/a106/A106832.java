package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106832 <code>4n-2</code> and <code>6n</code> alternatively.
 * @author Sean A. Irvine
 */
public class A106832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106832() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 6, 6, 12});
  }
}
