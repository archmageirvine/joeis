package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041136 Numerators of continued fraction convergents to sqrt(77).
 * @author Sean A. Irvine
 */
public class A041136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041136() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 702, 0, 0, 0, 0, 0}, new long[] {8, 9, 35, 79, 272, 351, 5888, 6239, 24605, 55449, 190952, 246401});
  }
}
