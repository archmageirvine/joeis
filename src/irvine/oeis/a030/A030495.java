package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a005.A005095;

/**
 * A030495 a(n) = (n+1)!+ n.
 * @author Sean A. Irvine
 */
public class A030495 extends A005095 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

