package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106269 Expansion of 1/((1 - x^2)*(2 - c(x))), where c(x) is the g.f. of A000108.
 * @author Georg Fischer
 */
public class A106269 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106269() {
    super(0, "[[0],[-2, 4],[0,-1],[2,-4],[0, 1]", "1, 1", 0);
  }
}
