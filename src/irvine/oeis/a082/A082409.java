package irvine.oeis.a082;

import irvine.oeis.FilterSequence;
import irvine.oeis.a055.A055114;

/**
 * A082409 Composite numbers k such that the continued fraction for k/m contains no 2 for any 1 &lt;= m &lt;= k.
 * @author Sean A. Irvine
 */
public class A082409 extends FilterSequence {

  /** Construct the sequence. */
  public A082409() {
    super(1, new A055114(), COMPOSITE);
  }
}
