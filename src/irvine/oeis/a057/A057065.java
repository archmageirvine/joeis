package irvine.oeis.a057;
// manually floorn at 2021-08-30 09:05

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057065 a(n) = floor(n^n/2).
 * @author Georg Fischer
 */
public class A057065 extends Sequence0 {

  private int mN = -1;
  
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN).divide2();
  }

}
