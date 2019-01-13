package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001411;

/**
 * A046661.
 * @author Sean A. Irvine
 */
public class A046661 extends A001411 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
