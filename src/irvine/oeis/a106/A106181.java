package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106181 Expansion of c(-x^2)(1+2x-sqrt(1+4x^2))/2, c(x) the g.f. of A000108.
 * @author Georg Fischer
 */
public class A106181 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106181() {
    super(0, "[[0],[-12, 4],[-4, 4],[0, 1],[2, 1]]", "0, 1,-1", 0);
  }
}
