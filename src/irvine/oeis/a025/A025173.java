package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025173.
 * @author Sean A. Irvine
 */
public class A025173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025173() {
    super(new long[] {-81, 36, -22, 4}, new long[] {0, 1, -5, -42});
  }
}
