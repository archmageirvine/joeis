package irvine.oeis.a342;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a007.A007030;
import irvine.oeis.a007.A007031;

/**
 * A342971 Non-1-tough simplicial polyhedra with n nodes.
 * @author Georg Fischer
 */
public class A342971 extends AbstractSequence {

  private final Sequence mSeq1 = new A007030().skip(10);
  private final Sequence mSeq2 = new A007031().skip(10);

  /** Construct the sequence. */
  public A342971() {
    super(11);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
