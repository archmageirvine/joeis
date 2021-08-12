package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050274 Middle value b for Diophantine 1-triples (a,b,c) ordered by smallest c,b.
 * @author Sean A. Irvine
 */
public class A050274 extends A050273 {

  @Override
  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(b);
  }
}

