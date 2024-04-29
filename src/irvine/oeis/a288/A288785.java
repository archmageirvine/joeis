package irvine.oeis.a288;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A288785 Number of blocks of size &gt;= three in all set partitions of n.
 * a(n) = Sum_{j=0..n- 3} binomial(n,j) * Bell(j).
 * @author Georg Fischer
 */
public class A288785 extends AbstractSequence {

  private int mN;
  private final int mParm;

  /** Construct the sequence. */
  public A288785() {
    this(3, 3);
  }

  protected A288785(final int offset, final int parm) {
    super(offset);
    mN = offset - 1;
    mParm = parm;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(0, mN - mParm, j -> {
      return Binomial.binomial(mN, j).multiply(Functions.BELL.z(j));
    });
  }
}
