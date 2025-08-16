package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385430 Least number k such that k and k + n! have the same number of divisors.
 * @author Sean A. Irvine
 */
public class A385430 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    long k = 0;
    while (true) {
      ++k;
      if (Functions.SIGMA0.z(f.add(k)).equals(Functions.SIGMA0.z(k))) {
        return Z.valueOf(k);
      }
    }
  }

  /**
   * Compute a specific term of this sequence.
   * @param args n
   */
  public static void main(final String[] args) {
    final A385430 seq = new A385430();
    seq.mN = Long.parseLong(args[0]) - 1;
    System.out.println(seq.next());
  }
}
