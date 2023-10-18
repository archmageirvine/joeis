package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A049501 Major index of n, first definition.
 * @author Sean A. Irvine
 */
public class A049501 extends AbstractSequence implements DirectSequence {

  private long mN = -1;

  /** Construct the sequence. */
  public A049501() {
    super(0);
  }

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    long sum = 0;
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) == '1' && s.charAt(k + 1) == '0') {
        sum += k + 1;
      }
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final int n) {
    final String s = Long.toBinaryString(n);
    long sum = 0;
    for (int k = 0; k < s.length() - 1; ++k) {
      if (s.charAt(k) == '1' && s.charAt(k + 1) == '0') {
        sum += k + 1;
      }
    }
    return Z.valueOf(sum);
  }

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

}
