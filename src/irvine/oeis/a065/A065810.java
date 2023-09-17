package irvine.oeis.a065;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;

/**
 * A065810 Sorted positions of the elements of the quasicyclic group Z+(2a+1)/(2^b) [a &gt; 0 and a &lt; 2^(b-1), b &gt; 0] at the ]0,1[ side of the Stern-Brocot Tree (A007305/A007306).
 * @author Sean A. Irvine
 */
public class A065810 extends A065674 implements Conjectural {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private long mM = 0;
  private long mT = 2;
  private long mL = 256;

  @Override
  public Z next() {
    if (++mM == mT) {
      mT *= 2;
      mL *= 2;
    }
    while (mA.size() < mL) {
      mA.add(super.next());
    }
    final Z res = mA.pollFirst();
    if (res.compareTo(mPrev) < 0) {
      throw new UnsupportedOperationException("Heuristic failed " + res + " should have been output earlier");
    }
    mPrev = res;
    return res;
  }
}
