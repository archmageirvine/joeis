package irvine.oeis.a285;

import irvine.oeis.a032.A032742;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A285729 Compound filter: a(n) = T(A032742(n), A046523(n)), where T(n,k) is sequence A000027 used as a pairing function.
 * @author Georg Fischer
 */
public class A285729 extends PairTransformSequence {

  /** Construct the sequence. */
  public A285729() {
    super(1, new A032742(), new A046523());
  }
}
