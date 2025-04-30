package irvine.oeis.a001;
// manually 2025-04-29

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A001006 Motzkin numbers: number of ways of drawing any number of nonintersecting chords joining n (labeled) points on a circle.
 * Recurrence: (n+2)*a(n) = (2*n+1)*a(n-1) + (3*n-3)*a(n-2). 
 * <code>a(n) = Sum_{k=0..n} C(n, 2k)*A000108(k)</code>
 * @author Georg Fischer
 */
public class A001006 extends HolonomicRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A001006() {
    super(0, "[[0],[-3, 3],[1, 2],[-2,-1]]", "[1, 1, 2]", 0);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int n) {
    return Integers.SINGLETON.sum(0, n, k -> Binomial.binomial(n, 2 * k).multiply(Functions.CATALAN.z(k)));
  }

}
