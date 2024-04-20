package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a024.A024140;

/**
 * A366717 Smallest prime dividing 12^n - 1.
 * @author Sean A. Irvine
 */
public class A366717 extends Sequence1 {

  private final Sequence mA = new A024140().skip();

  @Override
  public Z next() {
    return Functions.LPF.z(mA.next());
  }
}
