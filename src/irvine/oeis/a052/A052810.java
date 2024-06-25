package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A052810 a(n) = 1 + (number of partitions of n, n&gt;0).
 * @author Georg Fischer
 */
public class A052810 extends A000041 {

  private int mM = -1;

  @Override
  public Z next() {
    ++mM;
    return mM == 0 ? super.next() : super.next().add(1);
  }
}
