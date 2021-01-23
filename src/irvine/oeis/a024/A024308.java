package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023532;

/**
 * A024308 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k=[ (n+1)/2) ], s = (natural numbers &gt;= 2), t = A023532.
 * @author Sean A. Irvine
 */
public class A024308 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024308() {
    super(new A000027(), new A023532());
  }
}
