package irvine.oeis.a327;
// manually dersimpln at 2021-08-25 21:26

import irvine.math.z.Z;
import irvine.oeis.a043.A043000;

/**
 * A327737 a(n) is the sum of the lengths of the base-b expansions of n for all b with 1 &lt;= b &lt;= n.
 * @author Georg Fischer
 */
public class A327737 extends A043000 {

  protected int mN;
  
  /** Construct the sequence */
  public A327737() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ONE : super.next().add(mN);
  }
}
