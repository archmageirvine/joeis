package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293613 <code>a(n) = (1/4)*(7*n + 17)*(5*n + 6)*Pochhammer(n, 6) / 6!</code>.
 * @author Sean A. Irvine
 */
public class A293613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293613() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 66, 868, 5586, 24570, 84630, 245322, 625086, 1440582});
  }
}
