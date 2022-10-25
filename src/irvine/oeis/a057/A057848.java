package irvine.oeis.a057;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A057848 Number of 1-connected claw-free cubic graphs with 2n nodes.
 * @author Sean A. Irvine
 */
public class A057848 extends MemorySequence {

  private static final Z[] SMALL = {
    Z.ZERO,
    Z.ONE,
    Z.valueOf(60),
    Z.valueOf(2520),
    Z.valueOf(453600),
    Z.valueOf(59875200),
    Z.valueOf(13621608000L),
    Z.valueOf(8009505504000L),
    Z.valueOf(3123380227968000L),
    new Z("1832279324908032000"),
    new Z("2054813830468439040000"),
    new Z("1665031453088810526720000")
  };
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= SMALL.length) {
      return SMALL[n - 1];
    }

    Q sum = Q.ZERO;
    for (int k = 1; k <= n - 7; ++k) {
      final Q t = new Q(get(k).multiply(get(n - 7 - k)).multiply(k).multiply(n - 7 - k), mF.factorial(2 * k).multiply(mF.factorial(2 * n - 14 - 2 * k)));
      sum = sum.subtract(t.multiply(144));
    }
    for (int k = 1; k <= n - 6; ++k) {
      final Q t = new Q(get(k).multiply(get(n - 6 - k)).multiply(k).multiply(n - 6 - k), mF.factorial(2 * k).multiply(mF.factorial(2 * n - 12 - 2 * k)));
      sum = sum.subtract(t.multiply(288));
    }
    for (int k = 1; k <= n - 3; ++k) {
      final Q t = new Q(get(k).multiply(get(n - 3 - k)).multiply(k).multiply(n - 3 - k), mF.factorial(2 * k).multiply(mF.factorial(2 * n - 6 - 2 * k)));
      sum = sum.add(t.multiply(576));
    }
    sum = sum.subtract(new Q(get(n - 7).multiply(n - 7).multiply(n - 8).multiply(144), mF.factorial(2 * n - 14)));
    sum = sum.subtract(new Q(get(n - 6).multiply(n - 6).multiply(n - 7).multiply(288), mF.factorial(2 * n - 12)));
    sum = sum.add(new Q(get(n - 3).multiply(n - 3).multiply(n - 4).multiply(576), mF.factorial(2 * n - 6)));
    sum = sum.add(new Q(get(n - 10).multiply(n - 10).multiply(36), mF.factorial(2 * n - 20)));
    sum = sum.add(new Q(get(n - 9).multiply(n - 9).multiply(96), mF.factorial(2 * n - 18)));
    sum = sum.subtract(new Q(get(n - 8).multiply(n - 8).multiply(24), mF.factorial(2 * n - 16)));
    sum = sum.subtract(new Q(get(n - 7).multiply(n - 7).multiply(144), mF.factorial(2 * n - 14)));
    sum = sum.subtract(new Q(get(n - 6).multiply(n - 6).multiply(576), mF.factorial(2 * n - 12)));
    sum = sum.subtract(new Q(get(n - 5).multiply(n - 5).multiply(384), mF.factorial(2 * n - 10)));
    sum = sum.add(new Q(get(n - 4).multiply(n - 4).multiply(576), mF.factorial(2 * n - 8)));
    sum = sum.add(new Q(get(n - 3).multiply(n - 3).multiply(2880), mF.factorial(2 * n - 6)));
    sum = sum.add(new Q(get(n - 2).multiply(n - 2).multiply(576), mF.factorial(2 * n - 4)));
    return sum.multiply(mF.factorial(2 * n)).divide(1152L * n).toZ();
  }
}
