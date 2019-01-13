package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003761.
 * @author Sean A. Irvine
 */
public class A003761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003761() {
    super(new long[]{-1, 90, -1313, 5850, -9828, 5850, -1313, 90},
      new long[]{3, 270, 20160, 1477980, 108097935, 7903526400L, 577834413429L, 42245731959480L}
    );
  }
}
