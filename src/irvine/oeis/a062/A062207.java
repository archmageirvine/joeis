package irvine.oeis.a062;
// manually dersimpln at 2021-08-25 11:05

import irvine.math.z.Z;
import irvine.oeis.a013.A013499;

/**
 * A062207 2*n^n-1.
 * @author Georg Fischer
 */
public class A062207 extends A013499 {

  protected int mN;
  
  /** Construct the sequence */
  public A062207() {
    mN = 0;
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ONE : super.next().subtract(1);
  }
}
