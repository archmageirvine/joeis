package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084542 Numbers k such that 3^k + 10i is a Gaussian Prime.
 * @author Sean A. Irvine
 */
public class A084542 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084542() {
    super(1, k -> Z.NINE.pow(k).add(100).isProbablePrime());
  }
}
