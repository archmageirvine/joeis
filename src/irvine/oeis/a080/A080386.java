package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A080386 Numbers k such that there are exactly 8 numbers j for which binomial(k, floor(k/2)) / binomial(k,j) is an integer, i.e., A080383(k) = 8.
 * @author Sean A. Irvine
 */
public class A080386 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A080386() {
    super(1, 0, new A080383(), Z.EIGHT::equals);
  }
}
