package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a037.A037183;

/**
 * A065708 Sequence A037183(k) arranged in increasing order. Sequence gives k values.
 * @author Sean A. Irvine
 */
public class A065708 extends A037183 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mOrdering.get(mN - 1));
  }
}
