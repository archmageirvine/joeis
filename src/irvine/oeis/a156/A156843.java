package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156843 279841n^2 - 165048n + 24335.
 * @author Sean A. Irvine
 */
public class A156843 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156843() {
    super(new long[] {1, -3, 3}, new long[] {24335, 139128, 813603});
  }
}
