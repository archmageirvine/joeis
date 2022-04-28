package irvine.oeis.a172;
// manually deris/partprod at 2022-04-28 12:39

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a004.A004001;

/**
 * A172452 Partial products of A004001.
 * @author Georg Fischer
 */
public class A172452 extends PrependSequence {

  /** Construct the sequence. */
  public A172452() {
    super(new PartialProductSequence(new A004001()), 1);
  }
}
