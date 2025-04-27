package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A077033 Numbers k such that A068340(k) = +/-5.
 * @author Sean A. Irvine
 */
public class A077033 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077033() {
    super(1, new A068340(), k -> k.abs().equals(Z.FIVE));
  }
}
