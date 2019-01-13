package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014710.
 * @author Sean A. Irvine
 */
public class A014710 extends A014577 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

