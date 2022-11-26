package irvine.oeis.a322;
// manually A144613/parm2 at 2022-11-25 11:43

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a144.A144613;

/**
 * A322185 a(n) = sigma(2*n) * binomial(2*n,n)/2, for n &gt;= 1.
 * @author Georg Fischer
 */
public class A322185 extends A144613 {

  /** Construct the sequence. */
  public A322185() {
    super(2);
  }

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(2 * mN, mN).divide2());
  }
}
