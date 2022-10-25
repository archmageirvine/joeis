package irvine.oeis.a011;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011763 Days in year in proleptic Gregorian calendar.
 * @author Sean A. Irvine
 */
public class A011763 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Year.of(++mN).length());
  }
}
