package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A052839 Number of partitions of n into distinct summands (A000009), plus 1 (apart from the first term).
 * @author Georg Fischer
 */
public class A052839 extends A000009 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? super.next() : super.next().add(1);
  }
}
