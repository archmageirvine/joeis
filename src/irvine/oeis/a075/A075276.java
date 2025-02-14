package irvine.oeis.a075;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Quadruple;

/**
 * A075245.
 * @author Sean A. Irvine
 */
public class A075276 extends Sequence1 {

  private final Set<Z> mSeen = new TreeSet<>();
  private final TreeSet<Quadruple<Z>> mList = new TreeSet<>((q, r) -> {
    final Z maxq = Functions.MAX.z(q.a(), q.b(), q.c(), q.d());
    final Z maxr = Functions.MAX.z(r.a(), r.b(), r.c(), r.d());
    final int c = maxq.compareTo(maxr);
    if (c != 0) {
      return c;
    }
    return Integer.compare(q.hashCode(), r.hashCode());
  });
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mList.add(new Quadruple<>(Z.ONE, Z.ONE, Z.ONE, Z.ONE));
    mList.add(new Quadruple<>(Z.ONE, Z.ONE, Z.ONE, Z.THREE));
    mA.add(Z.ONE);
    mA.add(Z.THREE);
    mSeen.add(Z.ONE);
    mSeen.add(Z.THREE);
  }

  private void update(final Z a, final Z b, final Z c, final Z d) {
    final Z t = a.multiply(b).multiply(c).multiply(4).subtract(d);
    if (t.signum() > 0 && mSeen.add(t)) {
      mA.add(t);
      mList.add(new Quadruple<>(a, b, c, t));
    }
  }

  private boolean gt(final Z a, final Quadruple<Z> q) {
    return a.compareTo(q.a()) > 0 || a.compareTo(q.b()) > 0 || a.compareTo(q.c()) > 0 || a.compareTo(q.d()) > 0;
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || gt(mA.first(), mList.first())) {
      final Quadruple<Z> q = mList.pollFirst();
      final Z a = q.a();
      final Z b = q.b();
      final Z c = q.c();
      final Z d = q.d();
      update(a, b, c, d);
      update(b, c, d, a);
      update(c, d, a, b);
      update(d, a, b, c);
    }
    return mA.pollFirst();
  }
}
