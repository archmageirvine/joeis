package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a068.A068976;

/**
 * A069144 Numbers k such that A068976(k) divides k.
 * @author Sean A. Irvine
 */
public class A069144 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069144() {
    super(1, 1, new A068976(), (k, v) -> Z.valueOf(k).mod(v).isZero());
  }
}

