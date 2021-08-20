package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050805 Inserting any digit between adjacent digits of prime p never yields another prime.
 * @author Sean A. Irvine
 */
public class A050805 extends A000040 {

  private final int mTargetCount;

  protected A050805(final int count) {
    mTargetCount = count;
  }

  /** Construct the sequence. */
  public A050805() {
    this(0);
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z p = super.next();
      final String s = p.toString();
      int count = 0;
      for (char insert = '0'; insert <= '9'; ++insert) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int k = 1; k < s.length(); ++k) {
          sb.append(insert).append(s.charAt(k));
        }
        if (new Z(sb).isProbablePrime() && ++count > mTargetCount) {
          continue outer;
        }
      }
      if (count == mTargetCount) {
        return p;
      }
    }
  }
}
