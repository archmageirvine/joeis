package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051626;
import irvine.oeis.a051.A051628;

/**
 * A121341 Number of decimal places before 1/n either recurs or terminates.
 * @author Sean A. Irvine
 */
public class A121341 extends A051628 {

  private final Sequence mPeriod = new A051626();

  @Override
  public Z next() {
    return super.next().add(mPeriod.next());
  }
}
