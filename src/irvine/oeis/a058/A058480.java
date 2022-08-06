package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058480 Total number of interior nodes in all series-parallel networks with n labeled edges, multiple edges allowed.
 * @author Sean A. Irvine
 */
public class A058480 extends A058478 {

  private final Sequence mA = new A058479();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}

