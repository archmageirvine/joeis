package irvine.oeis.a329;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A329697 a(n) is the number of iterations needed to reach a power of 2 starting at n and using the map k -&gt; k-(k/p), where p is the largest prime factor of k.
 * @author Georg Fischer
 */
public class A329697 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A329697() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(Z n) {
    long count = 0;
    while (n.bitCount() > 1) {
      n = n.subtract(n.divide(Jaguar.factor(n).largestPrimeFactor()));
      ++count;
    }
    return Z.valueOf(count);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
