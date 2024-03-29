package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a213.A213086;

/**
 * A002221 a(n) is the number of partitions of 4n that can be obtained by adding together four (not necessarily distinct) partitions of n.
 * @author Sean A. Irvine
 */
public class A002221 extends A213086 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 4));
  }
}
