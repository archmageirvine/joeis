package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059936 Fifth step in Goodstein sequences, i.e., g(7) if g(2)=n: write g(6)=A059935(n) in hereditary representation base 6, bump to base 7, then subtract 1 to produce g(7).
 * @author Sean A. Irvine
 */
public class A059936 extends A059935 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return code(super.next(), 6);
  }
}
