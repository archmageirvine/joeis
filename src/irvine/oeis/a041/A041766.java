package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041766 Numerators of continued fraction convergents to sqrt(404).
 * @author Sean A. Irvine
 */
public class A041766 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041766() {
    super(new long[] {-1, 0, 402, 0}, new long[] {20, 201, 8060, 80801});
  }
}
