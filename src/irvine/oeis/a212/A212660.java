package irvine.oeis.a212;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001037;

/**
 * A212660 Partial products of A001037.
 * @author Georg Fischer
 */
public class A212660 extends PrependSequence {

  /** Construct the sequence. */
  public A212660() {
    super(new PartialProductSequence(new A001037()), 1);
  }
}
