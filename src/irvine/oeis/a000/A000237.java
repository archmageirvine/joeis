package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.transform.BikTransformSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A000237 Number of mixed Husimi trees with n nodes; or rooted polygonal cacti with bridges.
 * @author Sean A. Irvine
 */
public class A000237 extends Sequence0 {

  // Thanks to Christian Bower for helping me get this working.

  protected final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ZERO);
      return Z.ZERO;
    }
    final Sequence et = new EulerTransform(new BikTransformSequence(new FiniteSequence(mA), 1).skip(1), 1);
    for (int k = 1; k < mA.size(); ++k) {
      et.next();
    }
    final Z newTerm = et.next();
    mA.add(newTerm);
    return newTerm;
  }
}
