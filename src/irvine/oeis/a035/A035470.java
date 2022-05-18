package irvine.oeis.a035;

import java.util.Arrays;
import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035470 Number of ways to break {1,2,3,...n} into sets with equal sums.
 * @author Sean A. Irvine
 */
public class A035470 implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private final HashMap<String, Z> mCache = new HashMap<>();
  private int mN = 0;

  private Z bCompute(final int... args) {
    if (args[0] == 0) {
      if (args.length == 2) {
        return Z.ONE;
      } else {
        return b(Arrays.copyOfRange(args, 1, args.length));
      }
    }
    Z sum = Z.ZERO;
    for (int j = 0; j < args.length - 1; ++j) {
      if (args[j] - args[args.length - 1] >= 0) {
        final int[] a = Arrays.copyOf(args, args.length);
        a[j] -= args[args.length - 1];
        Arrays.sort(a, 0, args.length - 1); // Do NOT sort last element
        --a[args.length - 1];
        sum = sum.add(b(a));
      }
    }
    return sum;
  }

  private Z b(final int... args) {
    final String key = Arrays.toString(args);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = bCompute(args);
    mCache.put(key, res);
    return r;
  }

  @Override
  public Z next() {
    final int m = ++mN * (mN + 1) / 2;
    Z sum = Z.ONE;
    for (final Z dd : Jaguar.factor(m).divisors()) {
      final int d = dd.intValue();
      if (d >= mN && d != m) {
        final int[] a = new int[m / d + 1];
        Arrays.fill(a, d);
        a[m / d] = mN;
        sum = sum.add(b(a).divide(mF.factorial(m / d)));
      }
    }
    return sum;
  }
}

