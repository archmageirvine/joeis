package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041448 Numerators of continued fraction convergents to sqrt(240).
 * @author Sean A. Irvine
 */
public class A041448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041448() {
    super(new long[] {-1, 0, 62, 0}, new long[] {15, 31, 945, 1921});
  }
}
