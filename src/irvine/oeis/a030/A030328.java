package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030328 Length of n-th run of <code>0</code>'s in <code>A030324</code>.
 * @author Sean A. Irvine
 */
public class A030328 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030328() {
    super(new A030324());
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}

