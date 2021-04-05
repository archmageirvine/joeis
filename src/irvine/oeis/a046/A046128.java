package irvine.oeis.a046;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Quadruple;

/**
 * A046128 Smallest side a of scalene integer Heronian triangles sorted by increasing c and b.
 * @author Sean A. Irvine
 */
public class A046128 implements Sequence {

  private final TreeSet<Quadruple<Z>> mA = new TreeSet<>(
    Comparator.comparing((Function<Quadruple<Z>, Z>) Quadruple::c)
      .thenComparing(Quadruple::b)
      .thenComparing(Quadruple::a));
  private long mC = 4;

  protected Z select(final Quadruple<Z> quadruple) {
    return quadruple.a();
  }

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mC;
      for (long b = mC - 1; b >= 2; --b) {
        for (long a = b - 1; a >= 1; --a) {
          final Q s = new Q(a + b + mC, 2);
          final Q delta = s.multiply(s.subtract(a)).multiply(s.subtract(b)).multiply(s.subtract(mC));
          if (delta.signum() > 0 && delta.isInteger() && delta.toZ().isSquare()) {
            mA.add(new Quadruple<>(Z.valueOf(a), Z.valueOf(b), Z.valueOf(mC), delta.toZ().sqrt()));
          }
        }
      }
    }
    return select(mA.pollFirst());
  }
}
