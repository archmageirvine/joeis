package irvine.oeis.a392;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002880;
import irvine.oeis.a007.A007022;

/**
 * A392848 Number of 4-regular planar graphs with n vertices whose diagonal graphs are exactly 2-vertex connected and 3-edge connected.
 * @author Sean A. Irvine
 */
public class A392848 extends Combiner {

  /** Construct the sequence. */
  public A392848() {
    super(10, new A007022().skip(9), new A002880().skip(4), SUBTRACT);
  }
}
