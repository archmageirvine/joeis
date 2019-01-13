package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A006862.
 * @author Sean A. Irvine
 */
public class A006862 extends A002110 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

