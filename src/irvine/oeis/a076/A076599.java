package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A076599 Numbers n such that A068340(n) = +-10.
 * @author Sean A. Irvine
 */
public class A076599 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076599() {
    super(1, new A068340(), k -> Z.TEN.equals(k.abs()));
  }
}
