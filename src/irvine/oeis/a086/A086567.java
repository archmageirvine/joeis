package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A086567 Length of cycle produced by the function f: (x; y; z) -&gt;(x-y-z; y; 2*y + z) if y + = z &lt;x and (x; y; z) -&gt;(y + z -x; x; 2*x -z) if y +z &gt;x when started at (n,1,1).
 * @author Sean A. Irvine
 */
public class A086567 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  private Triple<Z> f(final Triple<Z> t) {
    return t.mid().add(t.right()).compareTo(t.left()) < 0
      ? new Triple<>(t.left().subtract(t.mid()).subtract(t.right()), t.mid(), t.mid().multiply2().add(t.right()))
      : new Triple<>(t.mid().add(t.right()).subtract(t.left()), t.left(), t.left().multiply2().subtract(t.right()));
  }

  @Override
  public Z next() {
    if (++mN == mM * mM + mM) {
      ++mM;
      return Z.ZERO;
    }
    final HashSet<Triple<Z>> s = new HashSet<>();
    Triple<Z> t = new Triple<>(Z.valueOf(mN), Z.ONE, Z.ONE);
    while (s.add(t)) {
      t = f(t);
    }
    return Z.valueOf(s.size());
  }
}
