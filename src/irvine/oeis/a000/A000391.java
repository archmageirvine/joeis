package irvine.oeis.a000;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000391 Euler transform of A000332.
 * @author Sean A. Irvine
 */
public class A000391 extends EulerTransform {

  /** Default constructor. */
  public A000391() {
    super(1, new SkipSequence(new A000332(), 4));
  }
}
