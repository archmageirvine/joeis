package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083226 a(n) = (8*9^n + (-9)^n)/9.
 * @author Sean A. Irvine
 */
public class A083226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083226() {
    super(new long[] {81, 0}, new long[] {1, 7});
  }
}
