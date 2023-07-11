package irvine.oeis.a055;

import irvine.oeis.a000.A000079;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A055891 CIK (necklace, indistinct, unlabeled) transform of powers of 2.
 * @author Sean A. Irvine
 */
public class A055891 extends CycleTransformSequence {

  /** Construct the sequence. */
  public A055891() {
    super(0, new A000079(), 1);
  }
}
