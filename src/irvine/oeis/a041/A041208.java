package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041208 Numerators of continued fraction convergents to sqrt(115).
 * @author Sean A. Irvine
 */
public class A041208 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041208() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2252, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {10, 11, 32, 43, 75, 118, 193, 311, 815, 1126, 23335, 24461, 72257, 96718, 168975, 265693, 434668, 700361, 1835390, 2535751});
  }
}
