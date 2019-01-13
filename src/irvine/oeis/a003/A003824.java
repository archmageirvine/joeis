package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A003824.
 * @author Sean A. Irvine
 */
public class A003824 implements Sequence {

  // Using ideas for Bernstein, "Enumerating Solutions to p(a) + q(b) = r(c) + s(d)", Math. Comp.

  protected static class MyTriple extends Triple<Z> implements Comparable<MyTriple> {

    MyTriple(final Z left, final Z mid, final Z right) {
      super(left, mid, right);
    }

    @Override
    public int compareTo(final MyTriple that) {
      final int a = left().compareTo(that.left());
      if (a != 0) {
        return a;
      }
      final int b = mid().compareTo(that.mid());
      if (b != 0) {
        return b;
      }
      return right().compareTo(that.right());
    }
  }

  private int mH = 0;
  private final TreeSet<MyTriple> mHeap = new TreeSet<>();

  protected Z a(final Z n) {
    return n.pow(4);
  }

  protected MyTriple nextTriple() {
    while (mHeap.isEmpty() || mHeap.first().mid().intValue() == mH) {
      final Z h = Z.valueOf(++mH);
      mHeap.add(new MyTriple(a(h).add(1), Z.ONE, h));
    }
    final MyTriple soln = mHeap.pollFirst();
    final Z a1 = soln.mid().add(1);
    mHeap.add(new MyTriple(a(a1).subtract(a(soln.mid())).add(soln.left()), a1, soln.right()));
    //System.out.println(soln);
    return soln;
  }

  private Z mPrev = null;
  private Z mGcd = null;
  private int mCount = 0;

  protected int count() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      final MyTriple t = nextTriple();
      if (!t.left().equals(mPrev)) {
        final Z old = mPrev;
        final Z oldGcd = mGcd;
        final int oldCount = mCount;
        mPrev = t.left();
        mCount = 1;
        mGcd = t.mid().gcd(t.right());
        if (old != null && oldCount > count() && Z.ONE.equals(oldGcd)) {
          return old;
        }
      } else {
        ++mCount;
        mGcd = mGcd.gcd(t.mid().gcd(t.right()));
      }
    }
  }
}
