package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068340;

/**
 * A076542 Numbers n such that A068340(n) = +-1.
 * @author Sean A. Irvine
 */
public class A076542 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076542() {
    super(1, new A068340(), k -> Z.ONE.equals(k.abs()));
  }
}
