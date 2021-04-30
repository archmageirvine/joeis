package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048435 Take the first n numbers written in base 3, concatenate them, then convert from base 3 to base 10.
 * @author Georg Fischer
 */
public class A048435 implements Sequence {

  protected long mN;
  protected int mBase;
  private final StringBuilder mS = new StringBuilder();

  /** Construct the sequence */
  public A048435() {
    this(3);
  }
  
  /**
   * Generic constructor with base
   * @param base number base for concatenation
   */
  public A048435(final int base) {
    mBase = base;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    // mS.append(mBase <= 10 ? Z.valueOf(mN).toString(mBase) : Z.valueOf(mN).toTwoDigits(mBase));
    mS.append(Z.valueOf(mN).toString(mBase));
    return new Z(mS, mBase);
  }
}
