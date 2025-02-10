package irvine.oeis.a075;

import irvine.lisp.SExpression;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075170 Sequence A075171 interpreted as binary numbers and converted to decimal.
 * @author Sean A. Irvine
 */
public class A075170 extends Sequence0 {

  private int mN = -1;

  private final MemoryFunction1<SExpression> mT = new MemoryFunction1<>() {
    @Override
    protected SExpression compute(final int n) {
      final SExpression s = new SExpression();
      if (n > 0) {
        long m = n;
        while (m != 0) {
          final long bit = m & 1;
          int cnt = 0;
          m >>>= 1;
          while ((m & 1) == bit) {
            ++cnt;
            m >>>= 1;
          }
          s.add(mT.get(cnt));
        }
      }
      return s.reverse();
    }
  };

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final SExpression s = mT.get(mN);
    //System.out.println(mN + " -> " + s);
    return s.toZ();
  }
}
