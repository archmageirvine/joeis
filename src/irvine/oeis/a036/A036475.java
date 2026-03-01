package irvine.oeis.a036;
// manually, new offset 2026-02-26

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A036475 a(n) = partition(11n+1) mod 11.
 * @author Georg Fischer
 */
public class A036475 extends AbstractSequence {

  private static final int DEFOFF = 0;
  protected int mN = -1;
  protected int mBase;
  protected Z mZBase;
  protected int mIncr;

  /** Construct the sequence. */
  public A036475() {
    this(0, 11, 1);
  }

  /**
   * Constructor with parameters
   * @param offset first index
   * @param base modulo base
   * @param incr additive term
   */
  protected A036475(final int offset, final int base, final int incr) {
    super(offset);
    mN = -1;
    mBase = base;
    mZBase = Z.valueOf(mBase);
    mIncr = incr;
  }

  /**
   * Constructor with parameters
   * @param base modulo base
   * @param incr additive term
   */
  protected A036475(final int base, final int incr) {
    this(DEFOFF, base, incr);
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.PARTITIONS.z(mBase * mN + mIncr).mod(mZBase);
  }
}
