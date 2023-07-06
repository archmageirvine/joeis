package irvine.oeis.a160;

import irvine.oeis.a005.A005130;
import irvine.oeis.transform.RootSequence;

/**
 * A160707 Convolution square root of the Robbins sequence, A005130, starting with offset 1.
 * @author Georg Fischer
 */
public class A160707 extends RootSequence {

  /** Construct the sequence. */
  public A160707() {
    super(1, new A005130().skip(2), 1, 2);
  }
}
