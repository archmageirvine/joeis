package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155155 a(n) = 2*(10*3^n - 1).
 * @author Sean A. Irvine
 */
public class A155155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155155() {
    super(new long[] {-3, 4}, new long[] {18, 58});
  }
}
