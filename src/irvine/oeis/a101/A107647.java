package irvine.oeis.a101;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000073;

/**
 * A107647 Euler's totient function applied to tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A107647 extends Sequence1 {

  private final Sequence mA = new A000073().skip(2);

  @Override
  public Z next() {
    return Functions.PHI.z(mA.next());
  }
}
