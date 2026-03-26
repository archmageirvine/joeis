package irvine.oeis.a394;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A394219.
 * @author Sean A. Irvine
 */
public class A394219 extends CachedSequence {

  // Using recurrences supplied by Benoit Cloitre

  /** Construct the sequence. */
  public A394219() {
    super(1);
  }

  private static final int[] SMALL_A = {0, 1, 2, 2, 2, 3, 3, 4, 4};
  private static final int[] SMALL_C0 = {0, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1};
  private static final int[] SMALL_C1 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0};
  private static final int[] SMALL_C2 = {0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0};
  private static final int[] SMALL_C3 = {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1};

  private final MemoryFunction1<Integer> mC0 = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < SMALL_C0.length) {
        return n < 0 ? 0 : SMALL_C0[n];
      }
      final int j = n / 4;
      switch (n & 3) {
        case 0:
          return (1 - mC0.get(j)) * mC0.get(j + 1) + mC0.get(j) * mC0.get(j - 1);
        case 1:
          return (1 - mC0.get(j)) * mC0.get(j - 1) + mC0.get(j) * mC0.get(j + 1);
        case 2:
          return mC0.get(j);
        default:
          return mC0.get(j + 1);
      }
    }
  };

  private final MemoryFunction1<Integer> mC1 = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < SMALL_C1.length) {
        return n < 0 ? 0 : SMALL_C1[n];
      }
      final int j = n / 4;
      switch (n & 3) {
        case 0:
          return mC2.get(j) * (mC1.get(j - 1) ^ mC1.get(j + 1));
        case 1:
          return 1 - mC2.get(j);
        case 2:
          return mC1.get(j);
        default:
          return mC1.get(j + 1);
      }
    }
  };

  private final MemoryFunction1<Integer> mC2 = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < SMALL_C2.length) {
        return n < 0 ? 0 : SMALL_C2[n];
      }
      final int j = n / 4;
      switch (n & 3) {
        case 0:
          return (1 - mC0.get(j - 1)) * mC1.get(j - 1) + mC0.get(j - 1) * (1 - mC1.get(j - 1)) * mC2.get(j);
        case 1:
          return mC2.get(j - 1);
        case 2:
          return mC2.get(j);
        default:
          return 1 - mC1.get(j);
      }
    }
  };

  private final MemoryFunction1<Integer> mC3 = new MemoryFunction1<>() {
    @Override
    protected Integer compute(final int n) {
      if (n < SMALL_C3.length) {
        return n < 0 ? 0 : SMALL_C3[n];
      }
      final int j = n / 4;
      switch (n & 3) {
        case 0:
          return mC2.get(j - 1) * (1 - (mC2.get(j) ^ mC1.get(j)));
        case 1:
          return mC3.get(j - 1);
        case 2:
          return mC3.get(j);
        default:
          return (1 - mC1.get(j + 1)) * (1 - (mC2.get(j) ^ mC1.get(j)));
      }
    }
  };

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n < SMALL_A.length) {
      return n < 0 ? Z.ZERO : Z.valueOf(SMALL_A[n]);
    }
    final int k = n / 4;
    switch (n & 3) {
      case 0:
        return a(k - 3)
          .add(a(k - 2))
          .add(a(k - 1))
          .add(a(k))
          .add(Z.ONE)
          .add(Z.valueOf(mC0.get(k)));
      case 1:
        return a(k - 2)
          .add(a(k - 1))
          .add(a(k))
          .add(a(k + 1))
          .add(Z.valueOf(mC1.get(k)));
      case 2:
        return a(k - 2)
          .add(a(k - 1))
          .add(a(k))
          .add(a(k + 1))
          .add(Z.valueOf(mC2.get(k)));
      default:
        return a(k - 1)
          .add(a(k))
          .add(a(k + 1))
          .add(a(k + 2))
          .subtract(Z.ONE)
          .add(Z.valueOf(mC3.get(k)));
    }
  }
}
