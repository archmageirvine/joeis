package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220753.
 * @author Sean A. Irvine
 */
public class A220753 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220753() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 4, 8, 11});
  }
}
