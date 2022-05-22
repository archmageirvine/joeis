package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A039511 a(n) = 2i + 1 where i is the least index such that A039508(i) = n or 0 if there is none.
 * @author Sean A. Irvine
 */
public class A039511 extends InverseSequence {

  /** Construct the sequence. */
  public A039511() {
    super(new A039508());
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
