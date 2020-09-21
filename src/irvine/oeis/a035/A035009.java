package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a001.A001861;

/**
 * A035009 STIRLING transform of [1,1,2,4,8,16,32,...].
 * @author Sean A. Irvine
 */
public class A035009 extends A001861 {

  @Override
  public Z next() {
    return Z.ONE.max(super.next().divide2());
  }
}
