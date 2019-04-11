package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000698;

/**
 * A005416 Vertex diagrams of order <code>2n</code>.
 * @author Sean A. Irvine
 */
public class A005416 extends A000698 {

  @Override
  public Z next() {
    return super.next().multiply(2L * size() - 3).abs();
  }
}
