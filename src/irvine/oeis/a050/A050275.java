package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050275 Largest value c for Diophantine 1-triples (a,b,c) ordered by smallest c,b.
 * @author Sean A. Irvine
 */
public class A050275 extends A050273 {

  @Override
  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(c);
  }
}

