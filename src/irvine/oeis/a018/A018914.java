package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018914 Pisot sequence <code>T(2,5), a(n) = floor(a(n-1)^2/a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A018914 extends PisotSequence {

  /** Construct the sequence. */
  public A018914() {
    super(2, 5, Q.ZERO);
  }
}
