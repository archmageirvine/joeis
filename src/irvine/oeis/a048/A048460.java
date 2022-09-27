package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a105.A105321;

/**
 * A048460 Total of odd numbers in the generations from 2 onwards.
 * @author Sean A. Irvine
 */
public class A048460 extends A105321 {

  {
    super.next();
    super.next();
  }

  @Override
  public int getOffset() {
    return 2;
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
