package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A014187.
 * @author Sean A. Irvine
 */
public class A014187 extends A002113 {

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
