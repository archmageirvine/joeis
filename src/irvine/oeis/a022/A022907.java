package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000123;

/**
 * A022907 The sequence <code>m(n)</code> in <code>A022905</code>.
 * @author Sean A. Irvine
 */
public class A022907 extends A000123 {

  @Override
  public Z next() {
    return super.next().multiply(3).divide2().subtract(1);
  }
}
