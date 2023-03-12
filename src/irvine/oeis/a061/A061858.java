package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.a004.A004247;
import irvine.oeis.a048.A048720;
/**
 * A061858 Differences between the ordinary multiplication table A004247 and the carryless multiplication table for GF(2)[X] polynomials A048720, i.e., the effect of the carry bits in binary multiplication.
 * @author Georg Fischer
 */
public class A061858 extends Combiner {

  /** Construct the sequence. */
  public A061858() {
    super(new A004247(), new A048720(), SUBTRACT);
  }
}
