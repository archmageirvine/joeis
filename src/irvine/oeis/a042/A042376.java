package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042376 Numerators of continued fraction convergents to sqrt(715).
 * @author Sean A. Irvine
 */
public class A042376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042376() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 151292, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 27, 80, 107, 615, 3182, 16525, 19707, 55939, 75646, 3989531, 4065177, 12119885, 16185062, 93045195, 481411037, 2500100380L, 2981511417L, 8463123214L, 11444634631L});
  }
}
