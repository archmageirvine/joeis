package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083226 <code>a(n) = (8*9^n + (-9)^n)/9</code>.
 * @author Sean A. Irvine
 */
public class A083226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083226() {
    super(new long[] {81, 0}, new long[] {1, 7});
  }
}
