package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A034703 Numbers of the form binomial(a+b+c, a) + binomial(a+b+c, b) + binomial(a+b+c, c), with a,b,c &gt;= 1.
 * @author Sean A. Irvine
 */
public class A034703 implements Sequence {

  private Z mPrev = Z.ZERO;

  private final TreeSet<Triple<Long>> mA = new TreeSet<>((o1, o2) -> {
    final int c = binomial(o1).compareTo(binomial(o2));
    if (c != 0) {
      return c;
    }
    final int c0 = o1.left().compareTo(o2.left());
    if (c0 != 0) {
      return c0;
    }
    final int c1 = o1.mid().compareTo(o2.mid());
    if (c1 != 0) {
      return c1;
    }
    return o1.right().compareTo(o2.right());
  });
  {
    mA.add(new Triple<>(1L, 1L, 1L));
  }

  private static Z binomial(final Triple<Long> t) {
    final long a = t.left();
    final long b = t.mid();
    final long c = t.right();
    final long u = a + b + c;
    return Binomial.binomial(u, a).add(Binomial.binomial(u, b)).add(Binomial.binomial(u, c));
  }

  @Override
  public Z next() {
    Z v;
    do {
      final Triple<Long> t = mA.pollFirst();
      final long a = t.left();
      final long b = t.mid();
      final long c = t.right();
      if (c < b) {
        mA.add(new Triple<>(a, b, c + 1));
      }
      if (b < a) {
        mA.add(new Triple<>(a, b + 1, c));
      }
      mA.add(new Triple<>(a + 1, b, c));
      v = binomial(t);
    } while (v.equals(mPrev));
    mPrev = v;
    return mPrev;
  }
}

