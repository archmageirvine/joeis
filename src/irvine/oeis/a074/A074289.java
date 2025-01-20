package irvine.oeis.a074;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A074289 Values of A000002(n)*A054353(n) that are repeated.
 * @author Sean A. Irvine
 */
public class A074289 extends A074288 {

  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (mA.remove(v)) {
        return v;
      }
      mA.add(v);
      // This next loop discards values that will never repeat
      while (mA.first().multiply2().compareTo(v) < 0) {
        mA.pollFirst();
      }
    }
  }
}
