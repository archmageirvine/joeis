package irvine.oeis.a140;
// manually robots/union2 at 2023-08-18 08:06

import irvine.oeis.PrependSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a053.A053027;
import irvine.oeis.a053.A053032;

/**
 * A140409 Prime factors of Lucas numbers.
 * @author Georg Fischer
 */
public class A140409 extends UnionSequence {

  /** Construct the sequence. */
  public A140409() {
    super(1, new PrependSequence(1, new A053027(), 2), new A053032());
  }
}
