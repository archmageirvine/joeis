package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030514 <code>a(n) = prime(n)^4</code>.
 * @author Sean A. Irvine
 */
public class A030514 extends A000040 {

  @Override
  public Z next() {
    return super.next().pow(4);
  }
}

