package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a002.A002464;

/**
 * A001266.
 * @author Sean A. Irvine
 */
public class A001266 extends A002464 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}
