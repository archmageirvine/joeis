package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027816 a(n) = 66*(n+1)*binomial(n+5,11).
 * @author Sean A. Irvine
 */
public class A027816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027816() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {462, 6336, 46332, 240240, 990990, 3459456, 10618608, 29405376, 74826180, 177365760, 395747352, 838053216, 1695505812});
  }
}
