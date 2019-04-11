package irvine.oeis.a138;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A138244 <code>a(1)=1</code>; for <code>n&gt;1, a(n) =</code> smallest integer <code>&gt; a(n-1)</code> such that <code>a(n)</code> is coprime to <code>(a(k) - a(k-1))</code> for all <code>k, 2 &lt;= k &lt;= n</code> and such that <code>(a(n) - a(n-1))</code> doesn't equal <code>(a(k) - a(k-1))</code> for any <code>k, 2 &lt;= k &lt;= n-1</code>.
 * @author Sean A. Irvine
 */
public class A138244 implements Sequence {

  private final ArrayList<Z> mDifferences = new ArrayList<>();
  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = Z.ONE;
    } else {
      Z t = mPrev;
      while (true) {
        t = t.add(1);
        final Z d = t.subtract(mPrev);
        if (Z.ONE.equals(t.gcd(d))) {
          boolean ok = true;
          for (final Z z : mDifferences) {
            if (d.equals(z) || !Z.ONE.equals(t.gcd(z))) {
              ok = false;
              break;
            }
          }
          if (ok) {
            mDifferences.add(d);
            mPrev = t;
            break;
          }
        }
      }
    }
    return mPrev;
  }
}

