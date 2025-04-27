package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A077032 Numbers k such that A068340(k)=+/-4.
 * @author Sean A. Irvine
 */
public class A077032 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A077032() {
    super(1, new A068340(), k -> k.abs().equals(Z.FOUR));
  }
}
