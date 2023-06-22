package irvine.oeis.a334;

import irvine.oeis.a008.A008578;
import irvine.oeis.transform.ExponentialRevertTransformSequence;

/**
 * A334263 E.g.f. A(x) satisfies: A(x) = x - Sum_{k&gt;=2} prime(k-1) * A(x)^k / k!.
 * @author Georg Fischer
 */
public class A334263 extends ExponentialRevertTransformSequence {

  /** Construct the sequence. */
  public A334263() {
    super(1, new A008578());
  }

}
