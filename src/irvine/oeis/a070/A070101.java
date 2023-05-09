package irvine.oeis.a070;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a024.A024156;

/**
 * A070101 Number of obtuse integer triangles with perimeter n.
 * @author Georg Fischer
 */
public class A070101 extends AbstractSequence {

  private A024156 mSeq1 = new A024156();
  private A070106 mSeq2 = new A070106();

  /** Construct the sequence. */
  public A070101() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
