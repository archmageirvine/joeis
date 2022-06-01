package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083713 a(n) = (8^n - 1)*3/7.
 * @author Sean A. Irvine
 */
public class A083713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083713() {
    super(new long[] {-8, 9}, new long[] {0, 3});
  }
}
