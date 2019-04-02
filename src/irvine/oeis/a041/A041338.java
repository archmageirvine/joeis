package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041338 Numerators of continued fraction convergents to sqrt(183).
 * @author Sean A. Irvine
 */
public class A041338 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041338() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 974, 0, 0, 0, 0, 0}, new long[] {13, 14, 27, 230, 257, 487, 12919, 13406, 26325, 224006, 250331, 474337});
  }
}
