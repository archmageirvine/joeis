package irvine.oeis.a056;

import irvine.oeis.PositionSequence;
import irvine.oeis.a055.A055229;

/**
 * A056196 Numbers n such that A055229(n) = 2.
 * @author Sean A. Irvine
 */
public class A056196 extends PositionSequence {

  /** Construct the sequence. */
  public A056196() {
    super(1, new A055229(), 2);
  }
}
