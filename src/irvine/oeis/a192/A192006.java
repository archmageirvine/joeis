package irvine.oeis.a192;
// manually changed 2020-09-03 13:01

import irvine.oeis.PrependSequence;
import irvine.oeis.a035.A035143;

/**
 * A192006 a(n) = Sum_{d|n} Kronecker(-14, d) with a(0) = 2.
 * @author Georg Fischer
 */
public class A192006 extends PrependSequence {

  /** Construct the sequence. */
  public A192006() {
    super(1, new A035143(-14), 2, 1);
  }
}
