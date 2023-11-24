package irvine.oeis.a000;

import irvine.oeis.PrependSequence;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A000608 Number of connected partially ordered sets with n unlabeled elements.
 * @author Sean A. Irvine
 */
public class A000608 extends PrependSequence {

  /** Construct the sequence. */
  public A000608() {
    super(0, new InverseEulerTransform(new A000112().skip()), 1);
  }
}
