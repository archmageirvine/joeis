package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145018 a(1) = 4; then add 1 to the first number, then 2, then 3 and so on.
 * @author Sean A. Irvine
 */
public class A145018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145018() {
    super(new long[] {1, -3, 3}, new long[] {4, 5, 7});
  }
}
