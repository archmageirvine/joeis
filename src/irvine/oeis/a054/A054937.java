package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006385;

/**
 * A054937 Number of chiral pairs of planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A054937 extends A006385 {

  /** Construct the sequence. */
  public A054937() {
    super(1);
  }

  private final Sequence mA = new A054936();

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
