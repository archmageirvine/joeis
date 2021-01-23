package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a004.A004094;

/**
 * A034906 Powers of 2 written backwards and sorted.
 * @author Sean A. Irvine
 */
public class A034906 extends A004094 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mLastLength = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().toString().length() == mLastLength) {
      final Z a = super.next();
      mA.add(a);
      mLastLength = a.toString().length();
    }
    return mA.pollFirst();
  }
}
