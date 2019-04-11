package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a213.A213086;

/**
 * A002222 <code>a(n)</code> is the number of partitions of <code>5n</code> that can be obtained by adding together five (not necessarily distinct) partitions of n.
 * @author Sean A. Irvine
 */
public class A002222 extends A213086 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 5));
  }
}
