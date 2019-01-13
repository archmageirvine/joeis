package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125908.
 * @author Sean A. Irvine
 */
public class A125908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125908() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {8, 64, 512, 4096, 32768, 262144, 2092112});
  }
}
