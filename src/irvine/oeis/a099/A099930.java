package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099930 <code>a(n) =</code> Pell(n)*Pell(n-1)*Pell(n-2) <code>/ 10</code>.
 * @author Sean A. Irvine
 */
public class A099930 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099930() {
    super(new long[] {-1, -12, 30, 12}, new long[] {1, 12, 174, 2436});
  }
}
