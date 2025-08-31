package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005117;

/**
 * A386993 Number of 2-dense sublists of divisors of the n-th squarefree number.
 * @author Sean A. Irvine
 */
public class A386993 extends AbstractSequence {

  private final Sequence mSeq;

  protected A386993(final int offset, final Sequence seq) {
    super(offset);
    mSeq = seq;
  }

  /** Construct the sequence. */
  public A386993() {
    this(1, new A005117());
  }

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(mSeq.next()).divisorsSorted();
    int c = 1;
    for (int k = 1; k < d.length; ++k) {
      if (d[k].compareTo(d[k - 1].multiply2()) > 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

