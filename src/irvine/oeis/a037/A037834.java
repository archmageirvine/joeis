package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a005.A005811;

/**
 * A037834 Sum{|d(i)-d(i-1)|: i=1,...,m}, where Sum{d(i)*2^i: i=0,1,...,m} is base 2 representation of n.
 * @author Sean A. Irvine
 */
public class A037834 extends A005811 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
