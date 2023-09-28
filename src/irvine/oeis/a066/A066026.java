package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A065964.
 * @author Sean A. Irvine
 */
public class A066026 extends Sequence1 {

  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    return CR.valueOf(mF.next()).log().ceil();
  }
}
