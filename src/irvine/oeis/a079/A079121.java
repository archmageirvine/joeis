package irvine.oeis.a079;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A079121 a(n+1) = floor((1/n)*(Sum_{k=1..n} a(k)^((n+1)/k))), given a(0)=1, a(1)=3, a(2)=8.
 * @author Sean A. Irvine
 */
public class A079121 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A079121() {
    super(0, (self, n) -> ComputableReals.SINGLETON.sum(1, n - 1, k -> CR.valueOf(self.a(k)).pow(new Q(n, k))).divide(n - 1).floor(), "1, 3, 8");
  }
}
