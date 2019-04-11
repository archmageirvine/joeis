package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042648 Numerators of continued fraction convergents to <code>sqrt(854)</code>.
 * @author Sean A. Irvine
 */
public class A042648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042648() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2588598, 0, 0, 0, 0, 0, 0, 0}, new long[] {29, 117, 263, 3010, 12303, 138343, 288989, 1294299, 75358331, 302727623, 680813577, 7791676970L, 31847521457L, 358114412997L, 748076347451L, 3350419802801L});
  }
}
