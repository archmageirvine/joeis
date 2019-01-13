package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004074.
 * @author Sean A. Irvine
 */
public class A004074 extends A004001 {

  @Override
  public Z next() {
    return super.next().multiply2().subtract(size());
  }

}
