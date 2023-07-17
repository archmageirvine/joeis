package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000367;

/**
 * A046753 Prime factors of |numerator(B(2n))| which are &gt;= 2n+3.
 * @author Sean A. Irvine
 */
public class A046753 extends A000367 {

  /** Construct the sequence. */
  public A046753() {
    super(1);
  }

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mT = Z.THREE;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mT = mT.add(2);
      for (final Z p : Jaguar.factor(super.next().abs()).toZArray()) {
        if (p.compareTo(mT) >= 0) {
          mA.add(p);
        }
      }
    }
    return mA.pollFirst();
  }
}
