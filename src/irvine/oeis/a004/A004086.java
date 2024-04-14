package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004086 Read n backwards (referred to as R(n) in many sequences).
 * @author Sean A. Irvine
 */
public class A004086 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A004086(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A004086() {
    super(0);
  }

  protected long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Functions.REVERSE.z(n);
  }
}

