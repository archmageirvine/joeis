package irvine.oeis.a110;
// Generated by gen_seq4.pl rootet at 2023-01-22 20:14

import irvine.oeis.a013.A013974;
import irvine.oeis.transform.RootSequence;

/**
 * A110150 G.f.: 4th root of Eisenstein series E_10 (cf. A013974).
 * G.f.: 4th root of Eisenstein series E_10 (cf. A013974).
 * @author Georg Fischer
 */
public class A110150 extends RootSequence {

  /** Construct the sequence. */
  public A110150() {
    super(0, new A013974().skip(1), 1, 4);
  }
}
