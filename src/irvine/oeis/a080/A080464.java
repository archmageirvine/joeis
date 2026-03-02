package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A080464 Product of the two numbers formed by alternate digits of n.
 * @author Sean A. Irvine
 */
public class A080464 extends AbstractSequence {

  /** Construct the sequence. */
  public A080464() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final long[] h = new long[2];
    for (int k = 0; k < s.length(); ++k) {
      h[k & 1] *= 10;
      h[k & 1] += s.charAt(k) - '0';
    }
    return Z.valueOf(h[0]).multiply(h[1]);
  }
}

