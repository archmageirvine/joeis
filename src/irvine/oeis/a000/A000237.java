package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence;
import irvine.oeis.transform.BikTransformSequence;
import irvine.oeis.transform.EulerTransformSequence;

/**
 * A000237 Number of mixed Husimi trees with n nodes; or rooted polygonal cacti with bridges.
 * @author Sean A. Irvine
 */
public class A000237 implements Sequence {

  // Thanks to Christian Bower for helping me get this working.

  protected final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Z.ZERO);
      return Z.ZERO;
    }
    final EulerTransformSequence et = new EulerTransformSequence(new BikTransformSequence(new FiniteSequence(mA), 1), 1);
    for (int k = 1; k < mA.size(); ++k) {
      et.next();
    }
    final Z newTerm = et.next();
    mA.add(newTerm);
    return newTerm;
  }
}
