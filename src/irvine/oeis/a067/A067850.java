package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A067850 Highest power of 2 not exceeding n!.
 * @author Sean A. Irvine
 */
public class A067850 extends A000142 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
