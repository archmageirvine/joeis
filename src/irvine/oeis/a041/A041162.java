package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041162 Numerators of continued fraction convergents to <code>sqrt(91)</code>.
 * @author Sean A. Irvine
 */
public class A041162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041162() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 3148, 0, 0, 0, 0, 0, 0, 0}, new long[] {9, 10, 19, 105, 124, 725, 849, 1574, 29181, 30755, 59936, 330435, 390371, 2282290, 2672661, 4954951});
  }
}
