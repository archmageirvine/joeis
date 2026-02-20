package irvine.oeis.a080;

import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079945;

/**
 * A080596 a(1)=1; for n &gt;= 2, a(n) is smallest positive integer which is consistent with sequence being monotonically increasing and satisfying a(a(n)) = 2n+3.
 * @author Sean A. Irvine
 */
public class A080596 extends PrependSequence {

  /** Construct the sequence. */
  public A080596() {
    super(1, new A079945().skip(2), 1);
  }
}
