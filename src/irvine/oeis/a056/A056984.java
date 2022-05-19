package irvine.oeis.a056;

import irvine.math.z.Z;

/**
 * A056984 A125138 with the -1 terms omitted.
 * @author Sean A. Irvine
 */
public class A056984 extends A056983 {

  @Override
  protected Z select(final long p, final int k) {
    return Z.valueOf(k);
  }
}
