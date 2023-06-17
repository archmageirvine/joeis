package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A040115 Concatenate absolute values of differences between adjacent digits of n.
 * @author Sean A. Irvine
 */
public class A040115 extends AbstractSequence {

  /** Construct the sequence. */
  public A040115() {
    super(10);
  }

  private long mN = 9;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int m = 1; m < s.length(); ++m) {
      sb.append(Math.abs(s.charAt(m) - s.charAt(m - 1)));
    }
    return new Z(sb);
  }
}
