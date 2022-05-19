package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a003.A003085;
import irvine.oeis.a035.A035512;

/**
 * A056988 Number of weakly connected digraphs on n unlabeled nodes that are not strongly connected.
 * @author Sean A. Irvine
 */
public class A056988 extends A003085 {

  private final Sequence mA = new A035512();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
