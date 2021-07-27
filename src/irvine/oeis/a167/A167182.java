package irvine.oeis.a167;
// manually 2021-06-21

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A167182 a(0)=1, a(1)=2; for n&gt;=2, a(n) = 2^A042950(n-2).
 * a(n) = (a(n-1))^2 for n &gt; 3.
 * @author Georg Fischer
 */
public class A167182 implements Sequence {
    
  protected int mN = 0;
  protected Z mAn = Z.ONE;
  
  @Override
  public Z next() {
    final Z result = mAn;
    if (mN <= 2) {
      ++mN;
      mAn = mAn.multiply2();
    } else {
      mAn = mAn.square();
    }
    return result;
  }
}
