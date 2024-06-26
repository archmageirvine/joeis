package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a060.A060143;
import irvine.oeis.memory.MemorySequence;

/**
 * A006336 a(n) = a(n-1) + a(n - 1 - number of even terms so far).
 * @author Sean A. Irvine
 */
public class A006336 extends MemorySequence {

  private final Sequence mSeq = new A060143();
  {
    setOffset(1);
    mSeq.next();
    mSeq.next();
  }

  @Override
  protected Z computeNext() {
    return size() == 0 ? Z.ONE : a(size() - 1).add(a(mSeq.next().intValueExact() - 1));
  }
}

