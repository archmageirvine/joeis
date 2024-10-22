package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a014.A014486;

/**
 * A072644 Size of the parenthesizations obtained with the global ranking/unranking scheme A072634-A072637.
 * @author Sean A. Irvine
 */
public class A072644 extends A072635 {

  private final DirectSequence mA = DirectSequence.create(new A014486());

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, mA.a(super.next()).add(1)).divide2();
  }
}
