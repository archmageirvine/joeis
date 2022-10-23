package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A003824 Numbers that are the sum of two 4th powers in more than one way (primitive solutions).
 * @author Sean A. Irvine
 */
public class A003824 extends Sequence1 {

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

  protected int count() {
    return 2;
  }

  private final ArrayList<MyTriple> mT = new ArrayList<>();

  private void add(final MyTriple t) {
    if (t.mid().compareTo(t.right()) <= 0) {
      mT.add(t);
    }
  }

  protected boolean isPrimitive(final List<MyTriple> triples) {
    for (int k = 0; k < triples.size(); ++k) {
      final MyTriple a = triples.get(k);
      final Z ga = a.mid().gcd(a.right());
      for (int j = k + 1; j < triples.size(); ++j) {
        final MyTriple b = triples.get(j);
        final Z gb = b.mid().gcd(b.right());
        final Z g = ga.gcd(gb);
        if (!Z.ONE.equals(g)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final MyTriple t = nextTriple();
      if (!t.left().equals(mPrev)) {
        final boolean ok = mT.size() >= count() && isPrimitive(mT);
        final Z old = mPrev;
        mPrev = t.left();
        mT.clear();
        add(t);
        if (ok) {
          return old;
        }
      } else {
        add(t);
      }
    }
  }
}
