package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015886 a(n) = smallest number k such that sigma(k + n) = sigma(k) + n, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A015886 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Jaguar.factor(mN + k).sigma().equals(Jaguar.factor(k).sigma().add(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

