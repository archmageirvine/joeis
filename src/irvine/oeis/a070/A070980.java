package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006577;

/**
 * A070963.
 * @author Sean A. Irvine
 */
public class A070980 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070980() {
    super(1, 1, new A006577(), (n, k) -> k.equals(Functions.SIGMA0.z(n)));
  }
}
