package irvine.oeis.a000;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000010 Euler totient function phi(n): count numbers &lt;= n and prime to n.
 * @author Sean A. Irvine
 */
public class A000010 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A000010(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A000010() {
    super(1);
  }

  protected long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Euler.phiAsLong(++mN));
  }
}

