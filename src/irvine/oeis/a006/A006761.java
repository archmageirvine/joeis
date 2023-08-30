package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a068.A068870;
import irvine.oeis.a290.A290305;

/**
 * A006761 Number of one-sided, properly 5-dimensional polyominoes with n cells.
 * @author Sean A. Irvine
 */
public class A006761 extends A290305 {

  /** Construct the sequence. */
  public A006761() {
    super(1);
  }

  private final A068870 mA = new A068870();

  {
    next(); // skip 0th term
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
