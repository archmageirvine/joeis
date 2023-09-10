package irvine.oeis.a305;
// manually recval at 2023-09-10 18:32

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a073.A073053;

/**
 * A305395 Records in A073053.
 * @author Georg Fischer
 */
public class A305395 extends RecordSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A305395() {
    super(1, new A073053());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.valueOf(11) : super.next();
  }
}
