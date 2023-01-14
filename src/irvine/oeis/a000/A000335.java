package irvine.oeis.a000;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000335 Euler transform of A000292.
 * @author Sean A. Irvine
 */
public class A000335 extends EulerTransform {

  /** Default constructor. */
  public A000335() {
    super(1, new SkipSequence(new A000292(), 1));
  }
}
