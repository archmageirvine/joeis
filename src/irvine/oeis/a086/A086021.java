package irvine.oeis.a086;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A086021 a(n) = Sum_{i=1..n} C(i+2,3)^3.
 * @author Sean A. Irvine
 */
public class A086021 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086021() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 65, 1065, 9065, 51940, 227556, 820260, 2548260, 7040385, 17688385, 41082041});
  }
}
