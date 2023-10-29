package irvine.oeis.a366;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A366821 a(n) is phi(n^n-1) where phi is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A366821 extends Sequence2 {

  private final Sequence mSeq = new A048861().skip();

  @Override
  public Z next() {
    return Euler.phi(mSeq.next());
  }
}
