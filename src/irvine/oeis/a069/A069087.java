package irvine.oeis.a069;

import irvine.math.z.Euler;
import irvine.oeis.FilterPositionSequence;

/**
 * A069087.
 * @author Sean A. Irvine
 */
public class A069087 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A069087() {
    super(1, 0, new A069891(), (n, k) -> k.compareTo(Euler.phi(n).multiply(n)) > 0);
  }
}

