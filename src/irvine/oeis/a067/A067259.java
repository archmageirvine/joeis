package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.oeis.FilterSequence;
import irvine.oeis.a004.A004709;

/**
 * A067259 Cubefree numbers which are not squarefree.
 * @author Sean A. Irvine
 */
public class A067259 extends FilterSequence {

  /** Construct the sequence. */
  public A067259() {
    super(1, new A004709(), k -> !Jaguar.factor(k).isSquareFree());
  }
}

