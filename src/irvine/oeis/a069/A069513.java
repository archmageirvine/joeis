package irvine.oeis.a069;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a010.A010055;

/**
 * A069513 Characteristic function of the prime powers p^k, k &gt;= 1.
 * @author Georg Fischer
 */
public class A069513 extends  A010055 {
    
  protected int mN = 0;

  /** Construct the sequence. */
  public A069513() {
    super.next();
  }
  
  @Override
  public Z next() {
    ++mN;
    return mN == 1 ? Z.ZERO : super.next();
  }
}
