package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106466.
 * @author Sean A. Irvine
 */
public class A106466 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106466() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 1, 2, 1, 3, 2});
  }
}
