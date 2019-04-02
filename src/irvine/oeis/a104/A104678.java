package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104678 a(n) = binomial(n+4,4) * binomial(n+9,4).
 * @author Sean A. Irvine
 */
public class A104678 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104678() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {126, 1050, 4950, 17325, 50050, 126126, 286650, 600600, 1178100});
  }
}
