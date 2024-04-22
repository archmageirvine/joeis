package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A007570 a(n) = F(F(n)), where F is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A007570 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A007570(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A007570() {
    super(0);
  }

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(Functions.FIBONACCI.z(++mN));
  }
}
