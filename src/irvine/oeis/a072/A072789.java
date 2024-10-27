package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014486;

/**
 * A072789 The size of the parenthesizations obtained with the global ranking/unranking scheme presented in A072787-A072788.
 * @author Sean A. Irvine
 */
public class A072789 extends Sequence1 {

  private final Sequence mB = new A072788().skip();
  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, mA.a(mB.next()).add(1)).divide2();
  }
}
