package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042824 Numerators of continued fraction convergents to sqrt(943).
 * @author Sean A. Irvine
 */
public class A042824 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042824() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1474, 0, 0, 0, 0, 0}, new long[] {30, 31, 92, 215, 522, 737, 44742, 45479, 135700, 316879, 769458, 1086337});
  }
}
