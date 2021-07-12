package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a014.A014575;

/**
 * A048934 Largest factor i of any factorization used in the definition of A014575(n).
 * @author Sean A. Irvine
 */
public class A048934 extends A014575 {

  @Override
  protected Z select(final Z n, final Z d) {
    return n.divide(d);
  }
}

