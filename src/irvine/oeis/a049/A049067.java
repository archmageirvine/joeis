package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049067 LaBar's conjecture (steps to return n to 1 after division by 3 and, if needed, multiplication by 2, addition of 1 or 2).
 * @author Sean A. Irvine
 */
public class A049067 implements Sequence {

  // Based on the program in the OEIS entry

  private long mN = 0;

  @Override
  public Z next() {
    long n = ++mN;
    boolean f = true;
    long s = 0;
    long t = 0;
    do {
      if (n % 3 == 0) {
        n /= 3;
        s += n;
      } else {
        if (f) {
          n = 2 * n + 2;
          t += n;
        } else {
          n = 2 * n + 1;
          t += n;
        }
        f = !f;
      }
    } while (n != 1);
    return Z.valueOf(s + t + mN);
  }
}
