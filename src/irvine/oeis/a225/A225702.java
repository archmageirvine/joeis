package irvine.oeis.a225;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A225702 Composite squarefree numbers n such that p-2 divides n+2 for each prime p dividing n.
 * @author Georg Fischer
 */
public class A225702 extends AbstractSequence {

  private int mN; // current index
  private int mAdd1;
  private int mAdd2;

  /** Construct the sequence. */
  public A225702() {
    this(1, 5, -2, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index of the sequence
   * @param start first value of n
   * @param add1 add to prime p
   * @param add2 add to n
   */
  public A225702(final int offset, final int start, final int add1, final int add2) {
    super(offset);
    mN = start - 1;
    mAdd1 = add1;
    mAdd2 = add2;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final FactorSequence fs = Jaguar.factor(n);
      if (fs.sigma0AsLong() > 2 && fs.isSquareFree()) {
        final Z na = n.add(mAdd2);
        final Z[] ps = fs.toZArray();
        boolean busy = true;
        int i = ps.length;
        while (busy && --i >= 0) {
          // System.out.println("mN=" + mN + ", p=" + ps[i]);
          final Z pa = ps[i].add(mAdd1);
          busy = !pa.isZero() && na.mod(pa).isZero();
        }
        if (busy) {
          return n;
        }
      }
    }
  }
}
