package irvine.oeis.a174;

import irvine.math.z.Z;
import irvine.oeis.a154.A154692;

/**
 * A174667 Triangle read by rows: T(n, k) = A154692(n, k) - A154692(n, 0) + 1.
 * @author Sean A. Irvine
 */
public class A174667 extends A154692 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return triangleElement(mN, mM).subtract(triangleElement(mN, 0)).add(1);
  }
}

