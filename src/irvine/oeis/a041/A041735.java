package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041735 Denominators of continued fraction convergents to sqrt(387).
 * @author Sean A. Irvine
 */
public class A041735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041735() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 6964, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 58, 119, 177, 6845, 7022, 20889, 403913, 828715, 1232628});
  }
}
