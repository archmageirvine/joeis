package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009837;

/**
 * A024342.
 * @author Sean A. Irvine
 */
public class A024342 extends A009837 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

