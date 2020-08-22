package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000178;

/**
 * A030428 a(n) = 0! * 1! * 2! * ... * n! - 1.
 * @author Sean A. Irvine
 */
public class A030428 extends A000178 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

