package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a365.A365577;
import irvine.util.Triple;

/**
 * A385972 The long legs of the triangles defined in A365577.
 * @author Sean A. Irvine
 */
public class A385972 extends A365577 {

  @Override
  protected Z select(final Triple<Z> t) {
    return t.mid();
  }
}
