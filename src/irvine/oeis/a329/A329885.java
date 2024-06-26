package irvine.oeis.a329;
// Generated by gen_seq4.pl amoda

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002322;
import irvine.oeis.a051.A051903;

/**
 * A329885 a(n) = A051903(n) mod A002322(n), where A051903 gives the maximal prime exponent of n, and A002322 is Carmichael's lambda (also known as psi).
 * @author Georg Fischer
 */
public class A329885 extends Sequence1 {

  private final A051903 mA051903 = new A051903();
  private final A002322 mA002322 = new A002322();

  /** Construct the sequence. */
  public A329885() {
  }

  @Override
  public Z next() {
    return mA051903.next().mod(mA002322.next());
  }
}

