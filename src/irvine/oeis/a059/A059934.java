package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a057.A057650;

/**
 * A059934 Third step in Goodstein sequences, i.e., g(5) if g(2)=n: write g(4)=A057650(n) in hereditary representation base 4, bump to base 5, then subtract 1 to produce g(5).
 * @author Sean A. Irvine
 */
public class A059934 extends A057650 {

  @Override
  public Z next() {
    return code(super.next(), 4);
  }
}
