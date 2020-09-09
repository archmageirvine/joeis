package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A034845 Primes of the form iii...ijjj...j, i != j.
 * @author Sean A. Irvine
 */
public class A034845 implements Sequence {

  private static final char[] SUFFIX = {'1', '3', '7', '9'};
  private TreeSet<Z> mA = new TreeSet<>();
  private int mLength = 1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mLength;
      // Work out all members of this length
      for (int prefixLength = 1; prefixLength < mLength; ++prefixLength) {
        final int tailLength = mLength - prefixLength;
        for (char prefix = '1'; prefix <= '9'; ++prefix) {
          final String s = StringUtils.rep(prefix, prefixLength);
          for (final char suffix : SUFFIX) {
            if (suffix != prefix) {
              final Z n = new Z(s + StringUtils.rep(suffix, tailLength));
              if (n.isProbablePrime()) {
                mA.add(n);
              }
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
