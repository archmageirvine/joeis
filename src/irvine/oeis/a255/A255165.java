package irvine.oeis.a255;
// manually dersimpln at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a043.A043000;

/**
 * A255165 a(n) = Sum_{k=2..n} floor(log(n)/log(k)), n &gt;= 1.
 * @author Georg Fischer
 */
public class A255165 extends A043000 {

  protected int mN;
  
  /** Construct the sequence */
  public A255165() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : super.next().subtract(mN).add(1);
  }
}
