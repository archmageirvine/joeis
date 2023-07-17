package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006966;

/**
 * A058802 Vertically decomposable lattices on n unlabeled nodes.
 * @author Sean A. Irvine
 */
public class A058802 extends A006966 {

  /** Construct the sequence. */
  public A058802() {
    super(3);
  }

  private final Sequence mA = new A058800();

  {
    super.next();
    super.next();
    super.next();
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
