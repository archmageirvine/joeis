package irvine.oeis.a280;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a049.A049820;

/**
 * A280981 future sequence
 * @author Georg Fischer
 */
public class A280981 extends PartialProductSequence {

  /** Construct the sequence. */
  public A280981() {
    super(new PrependSequence(2, new A049820(), 1, 1));
  }
}
