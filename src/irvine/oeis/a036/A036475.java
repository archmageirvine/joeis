package irvine.oeis.a036;
// manually, copied from A000041, 2020-10-30

import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036475 partition(11n+1) mod 11.
 * @author Georg Fischer
 */
public class A036475 implements Sequence {

  protected int mN = -1;
  protected int mBase;
  protected Z mZBase;
  protected int mIncr;

  /** Construct the sequence. */
  public A036475() {
    this(11, 1);
  }
  
  /**
   * Constructor with parameters
   * @param base modulo base
   * @param incr additive term
   */
  protected A036475(final int base, final int incr) {
    mN = -1;
    mBase = base;
    mZBase = Z.valueOf(mBase);
    mIncr = incr;
  }

  @Override
  public Z next() {
    ++mN;
    return IntegerPartition.partitions(mBase * mN + mIncr).mod(mZBase);
  }
}
