package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046738 Period of Fibonacci 3-step sequence A000073 mod n.
 * @author Sean A. Irvine
 */
public class A046738 implements Sequence {

  // After T. D. Noe

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long a = 0;
    long b = 1;
    long c = 1;
    long k = 0;
    do {
      ++k;
      final long s = (a + b + c) % mN;
      a = b;
      b = c;
      c = s;
    } while (a != 0 || b != 1 || c != 1);
    return Z.valueOf(k);
  }
}
