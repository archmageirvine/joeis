package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099930 a(n) = Pell(n)*Pell(n-1)*Pell(n-2) / 10.
 * @author Sean A. Irvine
 */
public class A099930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099930() {
    super(3, new long[] {-1, -12, 30, 12}, new long[] {1, 12, 174, 2436});
  }
}
