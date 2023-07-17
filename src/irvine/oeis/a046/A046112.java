package irvine.oeis.a046;

import irvine.oeis.a006.A006339;

/**
 * A046112 a(n) is smallest integral radius of circle centered at (0,0) having 8n-4 lattice points on its circumference; a(n)/2 is smallest half-integral radius circle centered at (1/2,0) having 4n-2 lattice points; a(n)/3 is smallest third-integral radius circle centered at (1/3,0) having 2n-1 lattice points.
 * @author Sean A. Irvine
 */
public class A046112 extends A006339 {

  /** Construct the sequence. */
  public A046112() {
    super(1);
  }
  // Differs only in offset
}
