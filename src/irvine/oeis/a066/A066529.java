package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001918;
import irvine.oeis.a023.A023048;

/**
 * A066529 a(n) is the least index such that the least primitive root of the a(n)-th prime is n, or zero if no such prime exists.
 * @author Sean A. Irvine
 */
public class A066529 extends A023048 {

  @Override
  protected Z select(final A001918 s) {
    return Z.valueOf(s.getIndex());
  }
}
