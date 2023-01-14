package irvine.oeis.a000;

import irvine.oeis.SkipSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000428 Euler transform of A000579.
 * @author Sean A. Irvine
 */
public class A000428 extends EulerTransform {

  /** Default constructor. */
  public A000428() {
    super(1, new SkipSequence(new A000579(), 6));
  }
}
