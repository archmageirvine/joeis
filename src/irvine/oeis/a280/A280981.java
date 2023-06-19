package irvine.oeis.a280;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a049.A049820;

/**
 * A280981 Partial products of A049820; a(1) = a(2) = 1.
 * @author Georg Fischer
 */
public class A280981 extends PartialProductSequence {

  /** Construct the sequence. */
  public A280981() {
    super(1, new PrependSequence(new A049820().skip(2), 1, 1));
  }
}
