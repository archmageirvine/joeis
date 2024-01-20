package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A030328 Length of n-th run of 0's in A030324.
 * @author Sean A. Irvine
 */
public class A030328 extends RunLengthTransform {

  /** Construct the sequence. */
  public A030328() {
    super(1, new A030324());
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

