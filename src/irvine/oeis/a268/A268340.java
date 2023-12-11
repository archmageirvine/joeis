package irvine.oeis.a268;
// manually 2021-06-22

import irvine.oeis.a046.A046660;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A268340 Characteristic function of the prime powers p^k, k &gt;= 2.
 * @author Georg Fischer
 */
public class A268340 extends MobiusTransformSequence {
    
  /** Construct the sequence. */
  public A268340() {
    super(new A046660(), 0);
    super.next();
  }
}
