package irvine.oeis.a330;
// manually deris/partprod at 2022-04-27 19:28

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a034.A034699;

/**
 * A330043 Product of largest prime power factors of numbers &lt;= n.
 * @author Georg Fischer
 */
public class A330043 extends PrependSequence {

  /** Construct the sequence. */
  public A330043() {
    super(new PartialProductSequence(new A034699()), 1);
  }
}
