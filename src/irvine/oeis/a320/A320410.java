package irvine.oeis.a320;

import irvine.math.z.Z;
import irvine.oeis.cons.FoldedContinuedFraction;

/**
 * A320410 Continued fraction of a constant t with partial denominators {a(n), n&gt;=0} such that the continued fraction of 4*t yields partial denominators {6*a(n), n&gt;=0}.
 * @author Georg Fischer
 */
public class A320410 extends FoldedContinuedFraction {

  /** Construct the sequence. */
  public A320410() {
    super(0, k -> Z.valueOf(24).pow(k).multiply(Z.FIVE), 1, 1, 1, 5, 1, 1, 1);
    setCfType(1);
  }
}
