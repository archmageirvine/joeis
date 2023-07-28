package irvine.oeis.a064;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a001.A001013;
import irvine.oeis.a025.A025487;

/**
 * A064783 Least prime signature numbers that are not a Jordan-Polya number.
 * @author Sean A. Irvine
 */
public class A064783 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A064783() {
    super(new A025487(), new A001013());
  }
}

