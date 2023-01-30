package irvine.oeis.a061;

import irvine.oeis.Combiner;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000290;
import irvine.oeis.a002.A002942;

/**
 * A061226 a(n) = n^2 + (n^2 with digits reversed).
 * @author Sean A. Irvine
 */
public class A061226 extends Combiner {

  /** Construct the sequence. */
  public A061226() {
    super(new A000290(), new PrependSequence(new A002942(), 0), ADD);
  }
}
