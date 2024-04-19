package irvine.oeis.a088;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A088020 a(n) = (n^2)!.
 * @author Georg Fischer
 */
public class A088020 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A088020(final int offset) {
    super(offset);
  }

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN;

  /** Construct the sequence. */
  public A088020() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return Functions.FACTORIAL.z(mN * mN);
  }
}
