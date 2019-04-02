package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051405 a(n) = (3^n+1)*(3^(n+1)+1)/4.
 * @author Sean A. Irvine
 */
public class A051405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051405() {
    super(new long[] {27, -39, 13}, new long[] {2, 10, 70});
  }
}
