package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A030322 Length of n-th run of 1's in A030317.
 * @author Sean A. Irvine
 */
public class A030322 extends RunLengthTransform {

  /** Construct the sequence. */
  public A030322() {
    super(1, new A030317());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

