package irvine.oeis.a002;

import irvine.oeis.a001.A001934;
import irvine.math.z.Z;

/**
 * A002318.
 * @author Sean A. Irvine
 */
public class A002318 extends A001934 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
