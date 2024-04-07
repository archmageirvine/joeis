package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a007.A007425;

/**
 * A069147 Numbers k such that tau_3(k) (the number of ordered factorizations of k as k = r*s*t) divides k.
 * @author Sean A. Irvine
 */
public class A069147 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069147() {
    super(1, 1, new A007425(), (k, v) -> Z.valueOf(k).mod(v).isZero());
  }
}

