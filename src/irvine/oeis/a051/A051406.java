package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051406 <code>a(n) = (3^n+1) * (3^(n+1)+1) / 8</code>.
 * @author Sean A. Irvine
 */
public class A051406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051406() {
    super(new long[] {27, -39, 13}, new long[] {1, 5, 35});
  }
}
