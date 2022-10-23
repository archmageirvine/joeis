package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082763 Roman numeral contains an asymmetric symbol (L).
 * <code>a(n)=floor((n-1)/50)*100+40+(n-1)%50</code>
 * @author Georg Fischer
 */
public class A082763 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 1).divide(50).multiply(100).add(40).add((mN - 1) % 50);
  }
}
