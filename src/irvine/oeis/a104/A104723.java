package irvine.oeis.a104;

import irvine.oeis.a001.A001045;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A104723 Moebius transform of Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A104723 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A104723() {
    super(new A001045(), 1);
  }
}
