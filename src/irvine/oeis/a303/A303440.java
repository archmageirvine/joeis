package irvine.oeis.a303;
// manually 2026-03-10/rpt2 at 2026-03-10 23:35

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.transform.RationalProductTransform;

/**
 * A303440 Expansion of Product_{k&gt;=1} ((1 + (2^k*x)^k)/(1 - (2^k*x)^k))^(1/2^k).
 * @author Georg Fischer
 */
public class A303440 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A303440() {
    super(0, "[1]", "x,B,x,C,*", 0, 0, 1, 1, new RationalProductTransform(0, new RationalProductTransform.Builder().
      fq(k -> new Q(-1, Z.TWO.pow(k))).g(k -> Z.TWO.pow(k).pow(k).negate())
    ), new RationalProductTransform(0, new RationalProductTransform.Builder().
      fq(k -> new Q(1, Z.TWO.pow(k))).g(k -> Z.TWO.pow(k).pow(k))
    ));
  }
}
