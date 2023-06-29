package irvine.oeis.a096;
// manually deris/partprod at 2021-12-09 19:40

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000037;

/**
 * A096769 a(n)=Max{ (i+j)!/i!^2 | 0&lt;=i,j&lt;=n }.
 * @author Georg Fischer
 */
public class A096769 extends PrependSequence {

  /** Construct the sequence. */
  public A096769() {
    super(1, new PartialProductSequence(new A000037()), 1);
  }
}
