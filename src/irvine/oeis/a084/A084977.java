package irvine.oeis.a084;

import java.util.Map;

import irvine.math.cr.CR;
import irvine.math.z.Z;

/**
 * A084971.
 * @author Sean A. Irvine
 */
public class A084977 extends A084974 {

  @Override
  protected Z select(final Map.Entry<Z, CR> e) {
    return e.getValue().multiply(1000000).floor();
  }
}
