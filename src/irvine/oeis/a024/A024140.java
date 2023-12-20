package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001021;

/**
 * A024140 a(n) = 12^n - 1.
 * @author Sean A. Irvine
 */
public class A024140 extends A001021 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
