package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125946.
 * @author Sean A. Irvine
 */
public class A125946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125946() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {10, 98, 940, 8798, 80140, 709238, 6096100});
  }
}
