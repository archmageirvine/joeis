package irvine.oeis.a292;
// manually deris/diffseq at 2022-04-27 19:28

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a057.A057660;

/**
 * A292302 Expansion of (1 - x)*Sum_{k&gt;=1} k*phi(k)*x^k/(1 - x^k), where phi() is the Euler totient function (A000010).
 * @author Georg Fischer
 */
public class A292302 extends PrependSequence {

  /** Construct the sequence. */
  public A292302() {
    super(new DifferenceSequence(new A057660()), 1);
  }
}
