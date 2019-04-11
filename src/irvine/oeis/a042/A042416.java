package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042416 Numerators of continued fraction convergents to <code>sqrt(736)</code>.
 * @author Sean A. Irvine
 */
public class A042416 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042416() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 48670, 0, 0, 0, 0, 0, 0, 0}, new long[] {27, 190, 217, 624, 841, 2306, 3147, 24335, 1317237, 9244994, 10562231, 30369456, 40931687, 112232830, 153164517, 1184384449});
  }
}
