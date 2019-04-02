package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254711 Pentagonal numbers (A000326) which are also centered square numbers (A001844).
 * @author Sean A. Irvine
 */
public class A254711 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254711() {
    super(new long[] {1, -1, -194, 194, 1}, new long[] {1, 5, 145, 925, 28085});
  }
}
