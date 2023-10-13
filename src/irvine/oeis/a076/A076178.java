package irvine.oeis.a076;
// manually 2023-10-12/simtraf at 2023-10-12

import irvine.oeis.PrependSequence;
import irvine.oeis.a078.A078903;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076178 a(n) = 2*n^2 - A077071(n).
 * @author Georg Fischer
 */
public class A076178 extends PrependSequence {

  /** Construct the sequence. */
  public A076178() {
    super(0, new SimpleTransformSequence(0, new A078903(), v -> v.multiply2()), 0);
  }
}
