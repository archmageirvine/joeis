package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A056141 a(n) = primefloor(n)*primeceiling(n) - previousprime(n)*nextprime(n).
 * @author Sean A. Irvine
 */
public class A056141 extends A056140 {

  private final Sequence mA = new SkipSequence(new A056139(), 1);

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
