package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005382;

/**
 * A389838 Numbers of the form j*k or j*k + (j-1)*(k-1) with j, k &gt; 1.
 * @author Sean A. Irvine
 */
public class A389838 extends ComplementSequence {

  /** Construct the sequence. */
  public A389838() {
    super(1, Z.TWO, new A005382());
  }
}
