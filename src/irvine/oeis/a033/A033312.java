package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A033312 <code>a(n) = n! - 1</code>.
 * @author Sean A. Irvine
 */
public class A033312 extends A000142 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

