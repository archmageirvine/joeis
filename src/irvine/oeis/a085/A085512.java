package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085512 Numbers k such that (89 + 10^(2*k+1))/99 is prime.
 * @author Sean A. Irvine
 */
public class A085512 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085512() {
    super(1, n -> Z.TEN.pow(2 * n + 1).add(89).divide(99).isProbablePrime());
  }
}
