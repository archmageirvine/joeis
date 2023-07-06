package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000045;

/**
 * A024315 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = floor(n/2), s = (natural numbers &gt;= 3), t = (Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A024315 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024315() {
    super(new A000027().skip(1), new A000045().skip(1));
  }
}
