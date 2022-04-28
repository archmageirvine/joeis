package irvine.oeis.a095;
// manually deris/partprod at 2022-04-28 12:39

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a049.A049684;

/**
 * A095968 Number of tilings of an n X n section of the square lattice with &quot;ribbon tiles&quot;. A ribbon tile is a polyomino which has at most one square on each diagonal running from northwest to southeast.
 * @author Georg Fischer
 */
public class A095968 extends PrependSequence {

  /** Construct the sequence. */
  public A095968() {
    super(new PartialProductSequence(new SkipSequence(new A049684(), 1)), 1);
  }
}
