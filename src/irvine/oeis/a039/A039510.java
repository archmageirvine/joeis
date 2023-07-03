package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;

/**
 * A039510 a(n) = 2i + 1 where i is the least index such that A039508(i) = A039509(n).
 * @author Sean A. Irvine
 */
public class A039510 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A039510() {
    super(0, new A039508(), 0);
  }

  @Override
  public Z next() {
    return super.next().multiply2().add(1);
  }
}
