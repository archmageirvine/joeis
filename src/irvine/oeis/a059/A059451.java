package irvine.oeis.a059;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A059451 Number of ways n can be written as the sum of two numbers whose binary expansions have even numbers of zeros; also number of ways n can be written as the sum of two numbers whose binary expansions have odd numbers of zeros.
 * @author Sean A. Irvine
 */
public class A059451 extends A059010 {

  /** Construct the sequence. */
  public A059451() {
    super(1);
  }

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 0;

  {
    mA.add(super.next().longValueExact()); // Avoid need for isEmpty check later
  }

  @Override
  public Z next() {
    ++mN;
    while (mN > mA.last()) {
      mA.add(super.next().longValueExact());
    }
    long cnt = 0;
    for (final long v : mA) {
      if (2 * v > mN) {
        break;
      }
      if (mA.contains(mN - v)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

