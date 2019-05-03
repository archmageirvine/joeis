package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a110.A110778;

/**
 * A112534 Number of digits in <code>A110778(n)</code>.
 * @author Sean A. Irvine
 */
public class A112534 extends A110778 {

  @Override
  protected Z output(final StringBuilder t) {
    return Z.valueOf(t.length());
  }
}

