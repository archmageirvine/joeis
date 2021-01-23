package irvine.oeis.a036;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036496 Number of lines that intersect the first n points on a spiral on a triangular lattice. The spiral starts at (0,0), goes to (1,0) and (1/2, sqrt(3)/2) and continues counterclockwise.
 * @author Sean A. Irvine
 */
public class A036496 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ZERO : CR.valueOf(Z.valueOf(mN).multiply(12).subtract(3)).sqrt().ceil();
  }
}

