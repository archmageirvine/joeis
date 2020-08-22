package irvine.oeis.a024;

import irvine.oeis.HalfConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a023.A023531;

/**
 * A024870 a(n) = s(1)t(n) + s(2)t(n-1) + ... + s(k)t(n-k+1), where k = [ n/2 ], s = (natural numbers &gt;= 2), t = A023531.
 * @author Sean A. Irvine
 */
public class A024870 extends HalfConvolutionSequence {

  /** Construct the sequence. */
  public A024870() {
    super(new A000027(), new A023531(), false);
    next();
  }
}
