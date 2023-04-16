package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000695;

/**
 * A062880 Zero together with the numbers which can be written as a sum of distinct odd powers of 2.
 * @author Sean A. Irvine
 */
public class A062880 extends A000695 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

