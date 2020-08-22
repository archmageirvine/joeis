package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009789;

/**
 * A024333 Expansion of e.g.f: tanh(log(1+x)^2)/2.
 * @author Sean A. Irvine
 */
public class A024333 extends A009789 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

