package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042543 Denominators of continued fraction convergents to <code>sqrt(800)</code>.
 * @author Sean A. Irvine
 */
public class A042543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042543() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 39202, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 95, 102, 197, 693, 39005, 117708, 156713, 274421, 3724186, 3998607, 7722793, 27166986});
  }
}
