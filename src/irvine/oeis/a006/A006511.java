package irvine.oeis.a006;

import java.util.Collection;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002181;

/**
 * A006511 Largest inverse of totient function <code>(A000010): a(n)</code> is the largest x such that <code>phi(x)=m</code>, where <code>m=A002202(n)</code> is the n-th number in the range of phi.
 * @author Sean A. Irvine
 */
public class A006511 extends A002181 {

  @Override
  protected Z select(final Collection<Z> c) {
    return ZUtils.max(c);
  }
}
