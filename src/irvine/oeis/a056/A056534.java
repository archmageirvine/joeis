package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056534 Mapping from the ordering by product (A027750, A056538) to the ordering by sum (A002260, A004736) of ordered pairs (a,b), a&gt;=1, b&gt;=1.
 * @author Sean A. Irvine
 */
public class A056534 implements Sequence {

  private long mN = 0;
  private int mM = 0;
  private Z[] mD = new Z[0];

  @Override
  public Z next() {
    if (++mM >= mD.length) {
      mD = Cheetah.factor(++mN).divisorsSorted();
      mM = 0;
    }
    final long d = mD[mM].longValueExact();
    return Binomial.binomial(mN / d + d - 1, 2).add(d);
  }
}
