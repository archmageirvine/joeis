package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001045;

/**
 * A366773 a(n) = A000010(A001045(n)).
 * @author Sean A. Irvine
 */
public class A366773 extends Sequence1 {

  private final Sequence mA = new A001045().skip();

  @Override
  public Z next() {
    return Functions.PHI.z(mA.next());
  }
}
