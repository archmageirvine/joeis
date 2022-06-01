package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238602 A sixth-order linear divisibility sequence related to the Pell numbers: a(n) := (1/60)*Pell(3*n)*Pell(4*n)/Pell(n).
 * @author Sean A. Irvine
 */
public class A238602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238602() {
    super(new long[] {-1, 170, 5745, -40052, 5745, 170}, new long[] {1, 238, 45507, 9063516, 1792708805, 355009117386L});
  }
}
