package irvine.oeis.a326;

import irvine.math.z.Z;
import irvine.oeis.a072.A072446;

/**
 * A326866 Number of connectedness systems on n vertices.
 * @author Sean A. Irvine
 */
public class A326866 extends A072446 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

