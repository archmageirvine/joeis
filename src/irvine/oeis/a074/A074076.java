package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a033.A033313;

/**
 * A074076 One-sixth of the area of some primitive Heronian triangles with a distance of 2n+1 between the median and altitude points on the longest side.
 * @author Sean A. Irvine
 */
public class A074076 extends A033313 {

  private int mN = 0;

  /*
  A074076 := proc(n) local Dmin, xmin, Dcap ; Dmin := -1; xmin := -1; mmin := -1; ymin := -1; for m from 1 to n do Dcap := (2*n+1+2*m)*(2*n+1-2*m) ; x := A033313(Dcap) ; if xmin = -1 or (x >0 and x<xmin ) then mmin := m ; xmin := x ; ymin := sqrt((xmin^2-1)/Dcap) ; Dmin := Dcap ; fi; od: Mmin := 2*mmin ; Mmin*Dmin*xmin*ymin/6 ; end:
   */

  @Override
  public Z next() {
    ++mN;
    int bestM = 0;
    Z bestD = null;
    Z xMin = Z.NEG_ONE;
    Z yMin = null;
    for (int m = 1; m <= mN; ++m) {
      final Z d = Z.valueOf(2L * mN + 1 + 2L * m).multiply(2L * mN + 1 - 2L * m);
      final Z x = select(solvePell(d));
      if (xMin.equals(Z.NEG_ONE) || (x.signum() > 0 && x.compareTo(xMin) < 0)) {
        xMin = x;
        bestD = d;
        bestM = m;
        yMin = xMin.square().subtract(1).divide(d).sqrt();
      }
    }
    return bestD.multiply(bestM).multiply(xMin).multiply(yMin).divide(3);
  }
}
