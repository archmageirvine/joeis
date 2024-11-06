package irvine.oeis.a073;
// manually 2024-10-15/multraf at 2024-11-03 20:08

import irvine.oeis.a000.A000796;
import irvine.oeis.a001.A001113;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A073212 n-th digit of Pi + n-th digit of e.
 * @author Georg Fischer
 */
public class A073212 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A073212() {
    super(1, (self, n) -> self.s(0).add(self.s(1)), "", new A000796(), new A001113());
    setOffset(0);
  }
}
