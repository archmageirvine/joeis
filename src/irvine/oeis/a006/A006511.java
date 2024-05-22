package irvine.oeis.a006;

import java.util.Collection;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002181;

/**
 * A006511 Largest inverse of totient function (A000010): a(n) is the largest x such that phi(x)=m, where m=A002202(n) is the n-th number in the range of phi.
 * @author Sean A. Irvine
 */
public class A006511 extends A002181 {

  @Override
  protected Z select(final Collection<Z> c) {
    return Functions.MAX.z(c);
  }
}
