package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009718;

/**
 * A024303 Expansion of <code>tan(tanh(x))*x/2</code>.
 * @author Sean A. Irvine
 */
public class A024303 extends A009718 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

