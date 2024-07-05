package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A071197 Possible prime values in A071195.
 * @author Sean A. Irvine
 */
public class A071197 extends A000040 {

  private final Sequence mSeq = new A071195();
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    Z p = Z.ONE;
    while (mA.isEmpty() || mA.first().compareTo(p) > 0) {
      mA.add(mSeq.next());
      p = super.next();
    }
    return mA.pollFirst();
  }
}
