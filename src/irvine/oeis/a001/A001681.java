package irvine.oeis.a001;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;

import java.util.Arrays;

/**
 * A001681 The partition function G(n,4).
 * @author Sean A. Irvine
 */
public class A001681 extends A001680 {

  private static final Polynomial<Q> ARG = RING.create(Arrays.asList(Q.ZERO, Q.ONE, Q.HALF, new Q(1, 6), new Q(1, 24)));

  @Override
  protected Polynomial<Q> polynomial() {
    return ARG;
  }
}
