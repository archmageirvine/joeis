package irvine.oeis.a065;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A065642 a(1) = 1; for n &gt; 1, a(n) = Min {m &gt; n | m has same prime factors as n ignoring multiplicity}.
 * @author Sean A. Irvine
 */
public class A065642 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A065642() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() == 1) {
      // Handle prime powers directly, n=p^k -> p^(k+1)
      // This is only for efficiency
      return fs.toZArray()[0].multiply(n);
    }
    final Z[] target = fs.toZArray();
    Z k = n;
    while (true) {
      k = k.add(1);
      if (Arrays.equals(Jaguar.factor(k).toZArray(), target)) {
        return k;
      }
    }
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

}
