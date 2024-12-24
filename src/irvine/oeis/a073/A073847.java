package irvine.oeis.a073;

import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070865;

/**
 * A073847 a(0) = 1, c(0) = 1, a(n) for n &gt; 0 is the smallest prime a(n-1) + c(n), where c(n) is composite and larger than c(n-1).
 * @author Sean A. Irvine
 */
public class A073847 extends PrependSequence {

  /** Construct the sequence. */
  public A073847() {
    super(0, new A070865().skip(2), 1);
  }
}
