package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.RunLengthSequence;

/**
 * A030312 Length of n-th run of <code>0</code>'s in <code>A030308</code>.
 * @author Sean A. Irvine
 */
public class A030312 extends RunLengthSequence {

  /** Construct the sequence. */
  public A030312() {
    super(new A030308());
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

