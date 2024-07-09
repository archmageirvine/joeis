package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A071219 Numbers m such that the largest prime factor of prime(m) + prime(m+1) equals m.
 * @author Sean A. Irvine
 */
public class A071219 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071219() {
    super(1, 1, new A071216(), (n, k) -> k.equals(Z.valueOf(n)));
  }
}
