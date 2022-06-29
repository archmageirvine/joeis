package irvine.oeis.a112;

import irvine.oeis.PrependSequence;
import irvine.oeis.a034.A034947;

/**
 * A112347 Kronecker symbol (-1, n) except a(0) = 0.
 * @author Sean A. Irvine
 */
public class A112347 extends PrependSequence {

  /** Construct the sequence. */
  public A112347() {
    super(new A034947(), 0);
  }
}
