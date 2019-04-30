package irvine.oeis.a019;

import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019989 A threequence, a 3-way partitioning of the integers: define <code>a,b</code>,c,A,B,C by a(0)=true, b(0)=c(0)=A(0)=B(0)=C(0)=false, a(n)=a(m) OR C(m) OR B(m), <code>b(n)=</code> b(m) OR A(m) OR C(m), <code>c(n)=</code> c(m) OR B(m) OR A(m), <code>A(n)=</code> A(m) OR b(m) OR c(m), <code>B(n)=</code> B(m) OR c(m) OR a(m), <code>C(n)=</code> C(m) OR a(m) OR b(m), where m <code>= [ (n+1)/3 ]</code>; sequence gives n such that <code>a(2n)</code> is true.
 * @author Sean A. Irvine
 */
public class A019989 implements Sequence {

  private Set<Z> mA = new TreeSet<>();
  private Set<Z> mB = new TreeSet<>();
  private Set<Z> mC = new TreeSet<>();
  private Set<Z> mBigA = new TreeSet<>();
  private Set<Z> mBigB = new TreeSet<>();
  private Set<Z> mBigC = new TreeSet<>();
  private Z mN = Z.ZERO;

  {
    step();
  }

  private Set<Z> union(final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    final Set<Z> res = new TreeSet<>();
    for (final Z e : a) {
      res.add(e.multiply(3));
    }
    for (final Z e : b) {
      res.add(e.multiply(3).subtract(1));
    }
    for (final Z e : c) {
      res.add(e.multiply(3).add(1));
    }
    return res;
  }

  private void step() {
    final Set<Z> newA = union(mA, mBigB, mBigC);
    final Set<Z> newB = union(mB, mBigC, mBigA);
    final Set<Z> newC = union(mC, mBigA, mBigB);
    final Set<Z> newBigA = union(mBigA, mC, mB);
    final Set<Z> newBigB = union(mBigB, mA, mC);
    final Set<Z> newBigC = union(mBigC, mB, mA);
    newBigC.add(Z.ONE);
    mA = newA;
    mB = newB;
    mC = newC;
    mBigA = newBigA;
    mBigB = newBigB;
    mBigC = newBigC;
  }

  protected boolean accept(final Z n, final Set<Z> a, final Set<Z> b, final Set<Z> c) {
    return a.contains(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mA.contains(mN) && !mB.contains(mN) && !mC.contains(mN)) {
        step();
      }
      if (accept(mN, mA, mB, mC)) {
        return mN.divide2();
      }
    }
  }
}
