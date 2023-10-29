package irvine.oeis.a066;

import irvine.oeis.Combiner;
import irvine.oeis.a000.A000142;
import irvine.oeis.a001.A001783;

/**
 * A066570 Product of numbers &lt;= n that have a prime factor in common with n.
 * @author Sean A. Irvine
 */
public class A066570 extends Combiner {

  /** Construct the sequence. */
  public A066570() {
    super(1, new A000142().skip(), new A001783(), DIVIDE);
  }
}
