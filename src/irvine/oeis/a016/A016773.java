package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016773 a(n) = (3*n)^9.
 * @author Sean A. Irvine
 */
public class A016773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016773() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 19683, 10077696, 387420489, 5159780352L, 38443359375L, 198359290368L, 794280046581L, 2641807540224L, 7625597484987L});
  }
}
