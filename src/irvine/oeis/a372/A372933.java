package irvine.oeis.a372;
// manually 2025-12-15/recval at 2025-12-15 17:16

import irvine.math.z.Z;
import irvine.oeis.RecordSequence;
import irvine.oeis.a071.A071961;

/**
 * A372933 Records in A071961, divided by 2.
 * @author Georg Fischer
 */
public class A372933 extends RecordSequence {

  /** Construct the sequence. */
  public A372933() {
    super(1, new A071961());
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
