package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003737.
 * @author Sean A. Irvine
 */
public class A003737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003737() {
    super(new long[] {0, -16, 32, 188, -120, -80, 50, 13},
      new long[] {4, 92, 1432, 22632, 357952, 5660752, 89521984, 1415743552}
    );
  }
}
