package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125910.
 * @author Sean A. Irvine
 */
public class A125910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125910() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {9, 81, 723, 6381, 55539, 475461, 3993243});
  }
}
