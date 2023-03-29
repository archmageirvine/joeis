package irvine.oeis.a285;
// manually A076577/parmof2 at 2023-03-26 20:41

import irvine.math.z.Z;
import irvine.oeis.a076.A076577;

/**
 * A285989 a(0) = 0, a(n) = Sum_{0&lt;d|n, n/d odd} d^4 for n &gt; 0.
 * @author Georg Fischer
 */
public class A285989 extends A076577 {

  private int mN = -1;

  /** Construct the sequence. */
  public A285989() {
    super(0, 4);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 0) ? Z.ZERO : result;
  }
}
