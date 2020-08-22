package irvine.oeis.a019;

import java.util.Set;

import irvine.math.z.Z;

/**
 * A019991 Indices n such that A307672(2*n) = 4.
 * @author Sean A. Irvine
 */
public class A019991 extends A019989 {

  @Override
  protected boolean accept(final Z n, final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    return c.contains(n);
  }
}
