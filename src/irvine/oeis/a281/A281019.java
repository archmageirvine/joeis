package irvine.oeis.a281;
// manually deris/partprod at 2022-04-28 15:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a051.A051953;

/**
 * A281019 Partial products of A051953; a(1) = 1.
 * @author Georg Fischer
 */
public class A281019 extends PartialProductSequence {

  /** Construct the sequence. */
  public A281019() {
    super(1, new PrependSequence(new A051953().skip(1), 1));
  }
}
