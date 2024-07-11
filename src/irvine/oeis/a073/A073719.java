package irvine.oeis.a073;

import irvine.oeis.a033.A033844;
import irvine.oeis.a065.A065856;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A073719 a(n) = floor(prime(2^n)/composite(2^n)).
 * @author Georg Fischer
 */
public class A073719 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A073719() {
    super(0, (n, s) -> s[0].divide(s[1]), "", new A033844(), new A065856());
  }
}
