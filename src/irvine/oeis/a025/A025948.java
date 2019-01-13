package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025948.
 * @author Sean A. Irvine
 */
public class A025948 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025948() {
    super(new long[] {-432, 462, -163, 22}, new long[] {1, 22, 321, 3938});
  }
}
