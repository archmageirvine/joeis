package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060896 <code>n^12 - n^6 + 1</code>.
 * @author Sean A. Irvine
 */
public class A060896 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060896() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 1, 4033, 530713, 16773121, 244125001, 2176735681L, 13841169553L, 68719214593L, 282429005041L, 999999000001L, 3138426605161L, 8916097462273L});
  }
}
