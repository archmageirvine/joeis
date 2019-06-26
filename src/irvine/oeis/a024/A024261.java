package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009377;

/**
 * A024261 Expansion of <code>log(1+tan(x)*sin(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024261 extends A009377 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

