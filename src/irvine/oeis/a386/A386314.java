package irvine.oeis.a386;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386314 a(1) = 1 and thereafter a(n) is the smallest number k of the form 6*x+-1 not already in the sequence but where the reduced Collatz step A139391(k) is in the sequence.
 * @author Sean A. Irvine
 */
public class A386314 extends Sequence1 {

  private final Set<Long> mA = new HashSet<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(1L);
      return Z.ONE;
    }
    long k = 0;
    while (true) {
      k += 6;
      // Try k - 1
      final long km = k - 1;
      if (!mA.contains(km) && mA.contains(Functions.MAKE_ODD.l(3 * km + 1))) {
        mA.add(km);
        return Z.valueOf(km);
      }
      // Try k + 1
      final long kp = k + 1;
      if (!mA.contains(kp) && mA.contains(Functions.MAKE_ODD.l(3 * kp + 1))) {
        mA.add(kp);
        return Z.valueOf(kp);
      }
    }
  }
}

