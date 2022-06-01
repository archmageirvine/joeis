package irvine.oeis.a083;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A083227 a(n) = (9*10^n + (-10)^n)/10.
 * @author Sean A. Irvine
 */
public class A083227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083227() {
    super(new long[] {100, 0}, new long[] {1, 8});
  }
}
