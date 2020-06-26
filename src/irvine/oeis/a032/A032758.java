package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032758 Undulating primes (digits alternate).
 * @author Sean A. Irvine
 */
public class A032758 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mLen = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mLen;
      for (int a = 1; a < 10; ++a) {
        for (int b = 0; b < 10; ++b) {
          if (a != b) {
            final StringBuilder sb = new StringBuilder();
            for (int k = 0; k < mLen / 2; ++k) {
              sb.append(a).append(b);
            }
            if ((mLen & 1) == 1) {
              sb.append(a);
            }
            final Z c = new Z(sb);
            if (c.isProbablePrime()) {
              mA.add(c);
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
