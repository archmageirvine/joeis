package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A030312 Length of n-th run of 0's in A030308.
 * @author Sean A. Irvine
 */
public class A030312 extends RunLengthTransform {

  /** Construct the sequence. */
  public A030312() {
    super(1, new A030308());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

