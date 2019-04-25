package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228203 x-values in the solution to <code>x^2 - 13y^2 = 27</code>.
 * @author Sean A. Irvine
 */
public class A228203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228203() {
    super(new long[] {-1, 0, 0, 0, 1298, 0, 0, 0}, new long[] {12, 40, 220, 768, 14808, 51700, 285520, 996852});
  }
}
