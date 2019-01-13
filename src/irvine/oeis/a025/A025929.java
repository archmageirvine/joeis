package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025929.
 * @author Sean A. Irvine
 */
public class A025929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025929() {
    super(new long[] {-288, 336, -134, 21}, new long[] {1, 21, 307, 3969});
  }
}
