package irvine.oeis.a006;

import java.util.Collection;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002181;

/**
 * A006511.
 * @author Sean A. Irvine
 */
public class A006511 extends A002181 {

  @Override
  protected Z select(final Collection<Z> c) {
    return ZUtils.max(c);
  }
}
