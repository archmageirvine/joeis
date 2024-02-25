package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083085 a(n) = (2+(-5)^n)/3.
 * @author Sean A. Irvine
 */
public class A083085 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083085() {
    super(new long[] {5, -4}, new long[] {1, -1});
  }
}
