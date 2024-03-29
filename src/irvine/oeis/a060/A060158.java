package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A060158 Number of permutations of [n] with 4 sequences.
 * @author Sean A. Irvine
 */
public class A060158 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A060158(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A060158() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.ZERO
      : Z.valueOf(2L * mN).subtract(7)
      .add(Z.valueOf(6 - mN).shiftLeft(mN - 1))
      .subtract(Z.THREE.pow(mN))
      .add(Z.ONE.shiftLeft(2L * (mN - 1)));
  }
}

