package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007539;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072002 extends Sequence2 {

  private final Sequence mSeq = new A007539().skip();

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
