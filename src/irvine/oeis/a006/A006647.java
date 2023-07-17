package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001430;
import irvine.oeis.a001.A001433;

/**
 * A006647 Number of graphs with n nodes, n-2 edges and no isolated vertices.
 * @author Sean A. Irvine
 */
public class A006647 extends A001430 {

  /** Construct the sequence. */
  public A006647() {
    super(4);
  }

  private Sequence mA = new A001433();

  {
    mA.next();
    mA.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
