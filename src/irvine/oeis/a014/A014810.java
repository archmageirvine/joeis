package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000521;
import irvine.oeis.a001.A001379;

/**
 * A014810 Multiplicity of trivial character in V_n, where V = Sum V_n is the graded module for the Monster simple group.
 * @author Sean A. Irvine
 */
public class A014810 implements Sequence {

  //private final Sequence mU = new A000521();
  private final Sequence mU = new SkipSequence(new A000521(), 2);
  //private final Sequence mU = new PrependSequence(new SkipSequence(new A000521(), 2), 1);
  private final MemorySequence mChi = MemorySequence.cachedSequence(new PrependSequence(new A001379(), 0));
  //private final Sequence mChi = new PrependSequence(new SkipSequence(new A001379(), 1), 1, 744);
  private int mN = 1;

  @Override
  public Z next() {
    final Z u = mU.next();
    ++mN;
    Z t = u;
    for (int k = mN; k > 1; --k) {
      final Z a = t.divide(mChi.a(k));
      t = t.subtract(a.multiply(mChi.a(k)));
    }
    return t;
  }
}
