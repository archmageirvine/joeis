package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a131.A131179;

/**
 * A079826 Consider the triangle shown below; sequence contains the concatenation of numbers read at a 45-degree angle upwards with horizontal beginning with the first term of a row.
 * @author Sean A. Irvine
 */
public class A079826 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A131179());
  private int mN = 0;

  private Z a056011(final int n, final int k) {
    final Z t = mA.a(n);
    return (n & 1) == 0 ? t.add(1 - k) : t.add(k - 1);
  }

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sb.append(a056011(mN - k + 1, k));
    }
    return new Z(sb);
  }
}

