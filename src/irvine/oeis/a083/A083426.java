package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083426 <code>(4*7^n+2^n)/5</code>.
 * @author Sean A. Irvine
 */
public class A083426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083426() {
    super(new long[] {-14, 9}, new long[] {1, 6});
  }
}
