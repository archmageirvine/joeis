package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123219 Expansion of <code>-x*(x^4 + 52*x^3 - 122*x^2 - 28*x + 1) / ((x-1)*(x^2 - 34*x + 1)*(x^2 + 6*x + 1))</code>.
 * @author Sean A. Irvine
 */
public class A123219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123219() {
    super(new long[] {1, -29, -174, 174, 29}, new long[] {1, 1, 81, 2401, 83521});
  }
}
