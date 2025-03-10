package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075256 List of pairs of numbers (a &lt; b) in the sequence {a,b}-&gt; {Max[{a,b}]-Min[{a,b}],k*Min[{a,b}]} with k=3 and the first pair {a=1,b=2}.
 * @author Sean A. Irvine
 */
public class A075256 extends Sequence1 {

  private Z mA = null;
  private Z mB = Z.TWO;
  private boolean mCompute = false;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (!mCompute) {
      mCompute = true;
      return mB;
    } else {
      mCompute = false;
      final Z min = mA.min(mB);
      final Z a = mA.max(mB).subtract(min);
      final Z b = min.multiply(3);
      if (a.compareTo(b) < 0) {
        mA = a;
        mB = b;
      } else {
        mA = b;
        mB = a;
      }
      return mA;
    }
  }
}
