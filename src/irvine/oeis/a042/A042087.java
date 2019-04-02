package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042087 Denominators of continued fraction convergents to sqrt(567).
 * @author Sean A. Irvine
 */
public class A042087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042087() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4048, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 16, 69, 85, 3979, 4064, 20235, 64769, 279311, 344080});
  }
}
