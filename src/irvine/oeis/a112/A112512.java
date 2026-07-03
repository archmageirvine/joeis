package irvine.oeis.a112;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A112512 Say what you see in previous term, same as A063850, but starting with 2.
 * @author Georg Fischer
 */
public class A112512 extends AbstractSequence {

  private Z mA; // current term

  /** Construct the sequence. */
  public A112512() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start first term
   */
  public A112512(final int offset, final long start) {
    super(offset);
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = Functions.INVENTORY.z(mA);
    return result;
  }
}
