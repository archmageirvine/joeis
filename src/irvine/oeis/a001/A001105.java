package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A001105 <code>a(n) = 2*n^2</code>.
 * @author Sean A. Irvine
 */
public class A001105 extends A000290 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

