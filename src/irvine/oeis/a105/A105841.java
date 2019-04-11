package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105841 Numbers n such that <code>n^2 =</code> 31*m^2 + 31*m <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A105841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105841() {
    super(new long[] {-1, 0, 0, 0, 9241598, 0, 0, 0}, new long[] {1, 309, 50469, 8242961, 17484559, 2855704251L, 466414209771L, 76178131891679L});
  }
}
