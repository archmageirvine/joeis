package irvine.oeis.a011;

import java.time.Year;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011763 Days in year in Gregorian calendar.
 * @author Sean A. Irvine
 */
public class A011763 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Year.of(++mN).length());
  }
}
