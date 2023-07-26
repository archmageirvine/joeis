package irvine.oeis.a105;

import irvine.oeis.a156.A156991;
import irvine.oeis.triangle.TruncatedTriangle;

/**
 * A105725 Triangle read by rows: T(n,k)=(n+k)!/k! (0&lt;=k&lt;=n-1; n&gt;=1).
 * @author Georg Fischer
 */
public class A105725 extends TruncatedTriangle {

  /** Construct the sequence. */
  public A105725() {
    super(1, new A156991());
  }
}
