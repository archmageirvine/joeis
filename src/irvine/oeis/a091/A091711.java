package irvine.oeis.a091;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a088.A088020;

/**
 * A091711 Exponent of 2 in (n^2)!.
 * @author Georg Fischer
 */
public class A091711 extends A088020 {

  /** Construct the sequence. */
  public A091711() {
    super(1);
  }

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), Z.TWO);
  }
}
