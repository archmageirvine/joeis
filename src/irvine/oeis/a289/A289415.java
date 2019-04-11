package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289415 <code>a(n) = ((11-sqrt(11))^n + (11+sqrt(11))^n) / 2</code>.
 * @author Sean A. Irvine
 */
public class A289415 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289415() {
    super(new long[] {-110, 22}, new long[] {1, 11});
  }
}
