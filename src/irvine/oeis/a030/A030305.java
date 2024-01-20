package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A030305 Length of n-th run of 0's in A030302.
 * @author Sean A. Irvine
 */
public class A030305 extends RunLengthTransform {

  /** Construct the sequence. */
  public A030305() {
    super(1, new A030302());
  }

  @Override
  public Z next() {
    super.next(); // skips runs of 1
    return super.next();
  }
}

