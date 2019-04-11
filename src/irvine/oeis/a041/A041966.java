package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041966 Numerators of continued fraction convergents to <code>sqrt(506)</code>.
 * @author Sean A. Irvine
 */
public class A041966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041966() {
    super(new long[] {-1, 0, 90, 0}, new long[] {22, 45, 2002, 4049});
  }
}
