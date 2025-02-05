package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;

/**
 * A074934.
 * @author Sean A. Irvine
 */
public class A074964 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074964() {
    super(1, 1, new A074963(), (n, k) -> k.equals(Functions.SIGMA1.z(n * n)));
  }
}
