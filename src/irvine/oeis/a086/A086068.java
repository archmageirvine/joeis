package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.InverseSequence;

/**
 * A086068 Min{k: A086066(k) = n}.
 * @author Sean A. Irvine
 */
public class A086068 extends InverseSequence {

  /** Construct the sequence. */
  public A086068() {
    super(1, new A086066());
  }

  @Override
  public Z next() {
    // sequence is finite
    return mN == 1023 ? null : super.next();
  }
}
