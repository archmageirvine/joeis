package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042055 Denominators of continued fraction convergents to sqrt(551).
 * @author Sean A. Irvine
 */
public class A042055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042055() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 16760, 0, 0, 0, 0, 0}, new long[] {1, 2, 17, 19, 169, 357, 16591, 33539, 284903, 318442, 2832439, 5983320});
  }
}
