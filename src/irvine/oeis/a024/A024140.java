package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a001.A001021;

/**
 * A024140 <code>a(n) = 12^n-1</code>.
 * @author Sean A. Irvine
 */
public class A024140 extends A001021 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
