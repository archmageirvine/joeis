package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041717 Denominators of continued fraction convergents to sqrt(378).
 * @author Sean A. Irvine
 */
public class A041717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041717() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 17498, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 7, 9, 43, 52, 199, 450, 17299, 35048, 122443, 157491, 752407, 909898, 3482101, 7874100});
  }
}
