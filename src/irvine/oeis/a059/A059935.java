package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059935 Fourth step in Goodstein sequences, i.e., g(6) if g(2)=n: write g(5)=A059934(n) in hereditary representation base 5, bump to base 6, then subtract 1 to produce g(6).
 * @author Sean A. Irvine
 */
public class A059935 extends A059934 {

  {
    setOffset(3);
    super.next();
  }

  @Override
  public Z next() {
    return code(super.next(), 5);
  }
}
