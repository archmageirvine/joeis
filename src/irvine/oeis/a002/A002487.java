package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import java.util.Iterator;

/**
 * A002487 Stern's diatomic series <code>(or Stern-Brocot</code> sequence): <code>a(0) = 0, a(1) = 1</code>; for <code>n &gt; 0: a(2*n) = a(n), a(2*n+1) = a(n) + a(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A002487 implements Sequence {

  private final Iterator<Q> mIt = Rationals.SINGLETON.iterator();

  @Override
  public Z next() {
    return mIt.next().num();
  }
}
