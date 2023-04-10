package irvine.oeis.a361;

import irvine.oeis.a018.A018252;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A361709 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A361709 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A361709() {
    super(new A018252(), 0);
    next();
  }
}
