package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A087119 Numbers having more than one maximal group of consecutive zeros in binary representation of n.
 * @author Sean A. Irvine
 */
public class A087119 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A087119() {
    super(1, 0, new A087116(), k -> k.compareTo(Z.ONE) > 0);
  }
}
