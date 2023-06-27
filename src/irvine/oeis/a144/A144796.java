package irvine.oeis.a144;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A144796 Expansion of x(5+215x-1253x^2-23x^3)/((1+34x+x^2)(1-34x+x^2)).
 * @author Sean A. Irvine
 */
public class A144796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144796() {
    super(1, new long[] {-1, 0, 1154, 0}, new long[] {5, 215, 4517, 248087});
  }
}
