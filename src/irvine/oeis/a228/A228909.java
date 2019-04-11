package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228909 <code>a(n) = 7^n - 6*6^n + 15*5^n - 20*4^n + 15*3^n - 6*2^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A228909 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228909() {
    super(new long[] {5040, -13068, 13132, -6769, 1960, -322, 28}, new long[] {0, 0, 0, 0, 0, 0, 720});
  }
}
