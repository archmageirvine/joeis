package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a005.A005811;

/**
 * A037834 a(n) = Sum_{i=1..m} |d(i) - d(i-1)|, where Sum_{i=0..m} d(i)*2^i is the base-2 representation of n.
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
