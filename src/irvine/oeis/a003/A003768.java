package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003768.
 * @author Sean A. Irvine
 */
public class A003768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003768() {
    super(new long[]{0, 0, 0, -64, 128, -256, 336, -264, 148, -62, 14},
      new long[]{2, 16, 144, 1216, 10004, 82608, 682636, 5639688, 46590712, 384898384, 3179752720L}
    );
  }
}
