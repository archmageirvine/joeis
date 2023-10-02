package irvine.oeis.a066;

import irvine.oeis.PrependSequence;
import irvine.oeis.a007.A007918;

/**
 * A066169 Least k such that phi(k) &gt;= n.
 * @author Sean A. Irvine
 */
public class A066169 extends PrependSequence {

  /** Construct the sequence. */
  public A066169() {
    super(1, new A007918().skip(3), 1);
  }
}
