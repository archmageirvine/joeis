package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228510 (128*n^4/25+14528*n^3/225+20344*n^2/75+661816*n/1575+168)*(n+6)!/n!.
 * @author Sean A. Irvine
 */
public class A228510 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228510() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {120960, 4682880, 54268416, 364571136, 1758756096, 6759726336L, 21978671616L, 62815154688L, 161990345088L, 384087420288L, 849090198528L});
  }
}
