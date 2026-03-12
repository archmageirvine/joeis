package irvine.oeis.a346;
// manually 2026-03-10/rpt2pfse at 2026-03-11 12:08

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A346964 Expansion of e.g.f. Product_{k&gt;=1} exp(x^k) * (1 + x^k).
 * @author Georg Fischer
 */
public class A346964 extends PrependSequence {

  /** Construct the sequence. */
  public A346964() {
    super(0, new PolynomialFieldSequence(0, "[1]", "x,B,x,C,*", 0, 1, 1, 1, new RationalProductTransform(0, new RationalProductTransform.Builder().
      f(-1).g(-1)
    ), new RationalProductTransform(0, new RationalProductTransform.Builder().
      fq(k -> new Q(Functions.PHI.z(k), k))
    )), 1);
  }
}
