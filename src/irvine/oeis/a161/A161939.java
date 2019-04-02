package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161939 a(n) = ((3+sqrt(2))*(4+sqrt(2))^n + (3-sqrt(2))*(4-sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A161939 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161939() {
    super(new long[] {-14, 8}, new long[] {3, 14});
  }
}
