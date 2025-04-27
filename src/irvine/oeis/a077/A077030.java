package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A077030 Numbers k such that A068340(k)=+/-2.
 * @author Sean A. Irvine
 */
public class A077030 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077030() {
    super(1, new A068340(), k -> k.abs().equals(Z.TWO));
  }
}
