package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a056.A056964;

/**
 * A061230 Numbers k such that k + the reversal of k is a square.
 * @author Sean A. Irvine
 */
public class A061230 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061230() {
    super(1, 0, new A056964(), Z::isSquare);
  }
}
