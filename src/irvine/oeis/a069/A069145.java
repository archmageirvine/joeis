package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A069145 Numbers k such that A069088(k) divides k.
 * @author Sean A. Irvine
 */
public class A069145 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069145() {
    super(1, 1, new A069088(), (k, v) -> Z.valueOf(k).mod(v).isZero());
  }
}

