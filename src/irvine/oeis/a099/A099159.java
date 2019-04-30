package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099159 <code>(L(n-2)+2*3^n)/5</code>.
 * @author Sean A. Irvine
 */
public class A099159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099159() {
    super(new long[] {-3, -2, 4}, new long[] {1, 1, 4});
  }
}
