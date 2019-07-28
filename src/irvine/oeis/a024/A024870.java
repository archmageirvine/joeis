package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023531;

/**
 * A024870 <code>a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1)</code>, where k <code>= [ n/2 ], s =</code> (natural numbers <code>&gt;= 2), t = A023531</code>.
 * @author Sean A. Irvine
 */
public class A024870 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024870() {
    super(new A000027(), new A023531(), false);
    next();
  }
}
