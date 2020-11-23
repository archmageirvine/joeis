package irvine.oeis.a036;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000328;

/**
 * A036693 Number of Gaussian integers z = a + bi satisfying n-1 &lt; |z| &lt;= n.
 * @author Sean A. Irvine
 */
public class A036693 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036693() {
    super(new PrependSequence(new A000328(), 0));
  }
}
