package irvine.oeis.a070;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a006.A006577;

/**
 * A070917 Numbers n such that the number of steps to reach 1 in the "3x+1" (or Collatz) problem divides n.
 * @author Sean A. Irvine
 */
public class A070917 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070917() {
    super(1, 2, new A006577().skip(), (n, k) -> n % k.intValueExact() == 0);
  }
}
