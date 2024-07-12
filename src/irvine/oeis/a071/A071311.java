package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A071311 Squarefree numbers k with largest prime factor = floor(sqrt(k)).
 * @author Sean A. Irvine
 */
public class A071311 extends FilterSequence {

  /** Construct the sequence. */
  public A071311() {
    super(1, new A005117().skip(), k -> Functions.GPF.l(k) == Functions.SQRT.l(k));
  }
}
