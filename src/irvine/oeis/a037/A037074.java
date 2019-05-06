package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A037074.
 * @author Sean A. Irvine
 */
public class A037074 extends A001359 {

  @Override
  public Z next() {
    final Z p = super.next();
    return p.multiply(p.add(2));
  }
}

