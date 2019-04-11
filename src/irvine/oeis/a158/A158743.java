package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158743 <code>a(n) = 1369*n^2 - 37</code>.
 * @author Sean A. Irvine
 */
public class A158743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158743() {
    super(new long[] {1, -3, 3}, new long[] {1332, 5439, 12284});
  }
}
