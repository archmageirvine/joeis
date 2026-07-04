package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A085652 Fibonacci sequence in base 2 of the alternate number system.
 * @author Sean A. Irvine
 */
public class A085652 extends Sequence1 {

  private final Sequence mA = new A000045().skip();

  @Override
  public Z next() {
    return new Z(mA.next().add(1).toString(2).substring(1).replace('1', '2').replace('0', '1'));
  }
}
