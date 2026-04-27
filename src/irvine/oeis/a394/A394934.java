package irvine.oeis.a394;

import irvine.oeis.a298.A298856;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A394934 a(n) is the largest k for which the number of parts of the symmetric representation of sigma of k, SRS(k), is odd and the upper Dyck path of SRS(k) touches the same point on the diagonal as A298856(k).
 * @author Sean A. Irvine
 */
public class A394934 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A394934() {
    super(1, new A298856(), k -> k.subtract(1));
  }
}
