package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a037.A037183;

/**
 * A065708 a(n) is the position of A037183(n) in a sorted list of the terms of A037183.
 * @author Sean A. Irvine
 */
public class A065708 extends A037183 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mOrdering.get(mN - 1));
  }
}
