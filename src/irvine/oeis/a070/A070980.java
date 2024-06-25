package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006577;

/**
 * A070980 Numbers k such that the number of steps to reach 1 in '3x+1' problem equals tau(k), the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A070980 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070980() {
    super(1, 1, new A006577(), (n, k) -> k.equals(Functions.SIGMA0.z(n)));
  }
}
