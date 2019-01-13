package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104652.
 * @author Sean A. Irvine
 */
public class A104652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104652() {
    super(new long[] {-1, 1, 0, -19602, 19602, 0, 1}, new long[] {0, 32, 3080, 6720, 637032, 60383960, 131735240});
  }
}
