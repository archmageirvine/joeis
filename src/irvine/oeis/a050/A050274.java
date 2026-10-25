package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050274 Middle value b in Diophantine 1-triples (a,b,c), with 0 &lt; a &lt; b &lt; c, ordered lexicographically by (c,a,b).
 * @author Sean A. Irvine
 */
public class A050274 extends A050273 {

  @Override
  protected Z select(final long a, final long b, final long c) {
    return Z.valueOf(b);
  }
}

