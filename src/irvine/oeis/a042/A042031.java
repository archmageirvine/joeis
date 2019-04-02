package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042031 Denominators of continued fraction convergents to sqrt(539).
 * @author Sean A. Irvine
 */
public class A042031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042031() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 7940, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 14, 23, 37, 171, 7903, 31783, 39686, 71469, 111155, 182624, 293779, 1357740});
  }
}
