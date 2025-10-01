package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a077.A077225;

/**
 * A080797 Starting with a(0)=5, a(n) = smallest squarefree number k such that, for all a(m) with m&lt;n, k+a(m) is not squarefree.
 * @author Sean A. Irvine
 */
public class A080797 extends A077225 {

  /** Construct the sequence. */
  public A080797() {
    super(Z.FIVE);
  }
}

