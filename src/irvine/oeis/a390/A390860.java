package irvine.oeis.a390;

import java.util.Random;

import irvine.math.r.DoubleUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390514.
 * @author Sean A. Irvine
 */
public class A390860 extends Sequence1 {

  // temp experiment

  private long mN = 0;

  @Override
  public Z next() {
    final Random r = new Random();
    final long trials = 100000000;
    long wins = 0;
    for (long k = 0; k < trials; ++k) {
      final int a1 = r.nextInt(6);
      final int a2 = r.nextInt(6);
      final int d1 = r.nextInt(6);
      if (a1 > d1 || a2 > d1) {
        ++wins;
      }
    }
    System.out.println(wins + "/" + trials + " = " + DoubleUtils.NF4.format((double) wins / trials));
    return null;
  }
}

