package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.math.zi.Zi;

/**
 * A086890 Imaginary part of Propp's cubic recurrence starting with i (i^2=-1).
 * @author Sean A. Irvine
 */
public class A086890 extends A086889 {

  @Override
  protected Z select(final Zi n) {
    return n.im();
  }
}
