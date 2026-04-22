package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084541 Numbers k such that 4^k + 9i is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A084541 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084541() {
    super(1, k -> Z.ONE.shiftLeft(4 * k).add(81).isProbablePrime());
  }
}
