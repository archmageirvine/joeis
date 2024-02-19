package irvine.oeis.a203;

import irvine.oeis.PrependSequence;
import irvine.oeis.a065.A065091;
import irvine.oeis.transform.ElementarySymmetricFunctionSequence;

/**
 * A203008 (n-1)-st elementary symmetric function of the first n odd primes; a(0) = 0.
 * @author Georg Fischer
 */
public class A203008 extends PrependSequence {

  /** Construct the sequence. */
  public A203008() {
    super(0, new ElementarySymmetricFunctionSequence(new A065091(), 0), 0);
  }
}
