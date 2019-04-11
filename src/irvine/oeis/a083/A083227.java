package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083227 <code>a(n) = (9*10^n + (-10)^n)/10</code>.
 * @author Sean A. Irvine
 */
public class A083227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083227() {
    super(new long[] {100, 0}, new long[] {1, 8});
  }
}
