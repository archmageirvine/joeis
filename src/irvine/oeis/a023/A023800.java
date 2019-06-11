package irvine.oeis.a023;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023800.
 * @author Sean A. Irvine
 */
public class A023800 implements Sequence {

  private final TreeSet<Long> mA = new TreeSet<>();

  protected A023800(final int base) {
    build(0, 0, base);
  }

  /** Construct the sequence. */
  public A023800() {
    this(5);
  }

  private void build(final long n, final int used, final int base) {
    for (int k = 0, j = 1; k < base; ++k, j <<= 1) {
      if ((used & j) == 0) {
        final long m = n * base + k;
        mA.add(m);
        build(m, used | j, base);
      }
    }
  }

  @Override
  public Z next() {
    return mA.isEmpty() ? null : Z.valueOf(mA.pollFirst());
  }
}

