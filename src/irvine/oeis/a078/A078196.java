package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A078196 The n-th digit from the left (most significant digit) of n^n.
 * @author Sean A. Irvine
 */
public class A078196 extends AbstractSequence {

  private int mN = 7;

  /** Construct the sequence. */
  public A078196() {
    super(8);
  }

  @Override
  public Z next() {
    return Z.valueOf(Z.valueOf(++mN).pow(mN).toString().charAt(mN - 1) - '0');
  }
}

