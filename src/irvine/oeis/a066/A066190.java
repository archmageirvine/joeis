package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a053.A053813;

/**
 * A066190 Numbers k such that the sum of the even aliquot parts of k divides k.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A066190 extends A053813 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
