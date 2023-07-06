package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;

/**
 * A024306 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n+1-k), where k=[ (n+1)/2) ], s = (natural numbers &gt;= 2), t = (natural numbers &gt;= 3).
 * @author Sean A. Irvine
 */
public class A024306 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024306() {
    super(new A000027(), new A000027().skip(1));
  }
}
