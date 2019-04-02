package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041463 Denominators of continued fraction convergents to sqrt(247).
 * @author Sean A. Irvine
 */
public class A041463 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041463() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 170584, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 67, 74, 733, 807, 1540, 3887, 5427, 166697, 172124, 510945, 683069, 1194014, 11429195, 12623209, 125038076, 137661285, 262699361, 663060007, 925759368});
  }
}
