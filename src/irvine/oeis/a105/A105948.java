package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105948 a(n) = C(n+7,n)*C(n+5,5).
 * @author Sean A. Irvine
 */
public class A105948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105948() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 48, 756, 6720, 41580, 199584, 792792, 2718144, 8281845, 22902880, 58402344, 139007232, 311800944});
  }
}
