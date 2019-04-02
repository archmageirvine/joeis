package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041809 Denominators of continued fraction convergents to sqrt(425).
 * @author Sean A. Irvine
 */
public class A041809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041809() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 536, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 5, 8, 13, 528, 541, 1069, 1610, 2679, 4289, 6968});
  }
}
