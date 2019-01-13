package irvine.oeis.a001;

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a000.A000404;

/**
 * A001481.
 * @author Sean A. Irvine
 */
public class A001481 extends UnionSequence {

  /** Default constructor. */
  public A001481() {
    super(new A000404(), new A000290());
  }
}
