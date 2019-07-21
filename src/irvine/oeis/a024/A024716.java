package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a005.A005001;

/**
 * A024716.
 * @author Sean A. Irvine
 */
public class A024716 extends A005001 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
